package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.BaiDang;
import model.bo.BaiDangBO;

/**
 * Servlet implementation class DanhSachBaiDangServlet
 */
public class DanhSachBaiDangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachBaiDangServlet() {
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
		
		BaiDangBO baiDangBO = new BaiDangBO();
		// ma trang thai lay tu url sub-menu BaiDang:
		String trangThai = request.getParameter("trangThaiUrl");
		
		if(trangThai.equals("dr")){
			trangThai = "Đang rao";
		}
		if(trangThai.equals("cpdd")){
			trangThai = "Chờ phê duyệt"; 
		}
		if(trangThai.equals("ktr")){
			trangThai = "Kết thúc rao";
		}		
		// lay du lieu tu database cua table BaiDang voi ma la trang thai:
		ArrayList<BaiDang> listBaiDangTrangThai=baiDangBO.danhSachBaiDangCodeTrangThai(trangThai);
		request.setAttribute("listBaiDangTrangThai",listBaiDangTrangThai );
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("admin/post.jsp");
		rd.forward(request, response);
	}

}
