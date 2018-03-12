package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DanhMuc;
import model.bean.Huong;
import model.bean.LoaiBaiDang;
import model.bean.PhuongXa;
import model.bean.QuanHuyen;
import model.bean.Tinh;
import model.bo.BaiDangBO;
import model.bo.DanhMucBO;
import model.bo.HuongBO;
import model.bo.LoaiBaiDangBO;
import model.bo.PhuongXaBO;
import model.bo.QuanHuyenBO;
import model.bo.TinhBO;

/**
 * Servlet implementation class DangTinTrangChuServlet
 */
public class DangTinTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangTinTrangChuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoaiBaiDangBO loaiBaiDangBO = new LoaiBaiDangBO();
		HuongBO huongBO = new HuongBO();
		DanhMucBO danhMucBO = new DanhMucBO();
		TinhBO tinhBO = new TinhBO();
		QuanHuyenBO quanHuyenBO = new QuanHuyenBO();
		PhuongXaBO phuongXaBO = new PhuongXaBO();
		BaiDangBO baiDangBO = new BaiDangBO();
		// lay loai bang dang:
		ArrayList<LoaiBaiDang> danhSachLoaiBaiDang=loaiBaiDangBO.layDuLieuLoaiBaiDang();
		request.setAttribute("danhSachLoaiBaiDang", danhSachLoaiBaiDang);
		// lay huong:
		ArrayList<Huong> danhSachHuong = huongBO.layDuLieuHuong();
		request.setAttribute("danhSachHuong", danhSachHuong);
		// lay du lieu danh muc:
		ArrayList<DanhMuc> danhSachDanhMuc = danhMucBO.layDuLieuDanhMuc();
		request.setAttribute("danhSachDanhMuc", danhSachDanhMuc);
		// lay du lieu tinh:
		ArrayList<Tinh> danhSachTinh = tinhBO.layDuLieuTinh();
		request.setAttribute("danhSachTinh", danhSachTinh);
		// lay du lieu quan huyen:
		ArrayList<QuanHuyen> danhSachQuanHuyen = quanHuyenBO.layDuLieuQuanHuyen();
		request.setAttribute("danhSachQuanHuyen", danhSachQuanHuyen);
		// lau du lieu phuong xa:
		ArrayList<PhuongXa> danhSachPhuongXa = phuongXaBO.layDuLieuPhuongXa();
		request.setAttribute("danhSachPhuongXa", danhSachPhuongXa);
		// lay du lieu join nhieu table:
		
		// lay du lieu ma thanh vien sesstion:
		
		// khong co trang thai: set co dinh la "chờ phê duyệt":
		
		// ma admin k chen:
		// khi nhan submit:
		if("submit".equals(request.getParameter("submit"))){
			String abc = request.getParameter("");
			
			String checkThem = baiDangBO.themBaiDang(maBaiDang, maLoaiBaiDang, maThanhVien, maHuong, maDanhMuc, maTinh, maQuanHuyen, maPhuongXa, tenBaiDang, trangThai, gia, dienTich, donVi, hinhAnh, thoiGian, diaChi, moTa);
			if(checkThem.endsWith("Chèn thành công")){
				response.sendRedirect("");
			}else{
				//finally:
				RequestDispatcher rd = request.getRequestDispatcher("dangtintrangchu.jsp");
				rd.forward(request, response);
			}
		}
		
		
		
	}

}
