package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.BaiDang;
import model.bean.ThanhVien;
import model.bo.BaiDangBO;
import model.bo.ThanhVienBO;

/**
 * Servlet implementation class ChiTietBaiDangServlet
 */
public class ChiTietBaiDangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietBaiDangServlet() {
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
		ThanhVienBO thanhVienBO = new ThanhVienBO(); 
		// ma bai dang duoc lay tu url:
		String maBaiDang = request.getParameter("maBaiDangUrl");
		
		// lay chi tiet bai dang bang ma bai dang:
		BaiDang baiDang=baiDangBO.chiTietBaiDang(maBaiDang);
		request.setAttribute("baiDang", baiDang);
		
		// lay du lieu thanh vien:
		
		ThanhVien thanhVien = thanhVienBO.thanhVienCode(baiDang.getMaThanhVien());
		request.setAttribute("thanhVien",thanhVien );
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("admin/detailbaidang.jsp");
		rd.forward(request, response);
	}

}
