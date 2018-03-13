package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.BaiDang;
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
 * Servlet implementation class TrangChuBatDongSanServlet
 */
public class TrangChuBatDongSanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TrangChuBatDongSanServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//
		LoaiBaiDangBO loaiBaiDangBO = new LoaiBaiDangBO();
		HuongBO huongBO = new HuongBO();
		DanhMucBO danhMucBO = new DanhMucBO();
		TinhBO tinhBO = new TinhBO();
		QuanHuyenBO quanHuyenBO = new QuanHuyenBO();
		PhuongXaBO phuongXaBO = new PhuongXaBO();
		BaiDangBO baiDangBO = new BaiDangBO();
		// danh sach bai dang:
		ArrayList<BaiDang> danhSachTongHopBaiDang = null;

		// lay loai bang dang:
		ArrayList<LoaiBaiDang> danhSachLoaiBaiDang = loaiBaiDangBO
				.layDuLieuLoaiBaiDang();
		request.setAttribute("danhSachLoaiBaiDang", danhSachLoaiBaiDang);
		// lay du lieu tinh:
		ArrayList<Tinh> danhSachTinh = tinhBO.layDuLieuTinh();
		request.setAttribute("danhSachTinh", danhSachTinh);
		// lay du lieu quan huyen:
		ArrayList<QuanHuyen> danhSachQuanHuyen = quanHuyenBO
				.layDuLieuQuanHuyen();
		request.setAttribute("danhSachQuanHuyen", danhSachQuanHuyen);
		// lau du lieu phuong xa:
		ArrayList<PhuongXa> danhSachPhuongXa = phuongXaBO.layDuLieuPhuongXa();
		request.setAttribute("danhSachPhuongXa", danhSachPhuongXa);

		// neu nhan sub mit:
		if ("submit".equals(request.getParameter("submit"))) {
			String maLoaiBaiDang = request.getParameter("maloaibatdongsan");
			String maTinh = request.getParameter("matinh");;
			String maQuanHuyen = request.getParameter("quanhuyen");
			danhSachTongHopBaiDang = baiDangBO.layDanhSachTimKiemBaiDang(
					maLoaiBaiDang, maTinh, maQuanHuyen);
		} else {
			danhSachTongHopBaiDang = baiDangBO
					.layDuLieuBaiDangJoinChiTietBangDang();
		}
		if(danhSachTongHopBaiDang.size()==0){
			String thongBao = "Không tìm thấy kết quả tìm kiếm, vui lòng tìm kiếm lại. Xin cảm ơn!";
			request.setAttribute("thongBao", thongBao);
		}
		request.setAttribute("danhSachTongHopBaiDang", danhSachTongHopBaiDang);
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("trangchu.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
