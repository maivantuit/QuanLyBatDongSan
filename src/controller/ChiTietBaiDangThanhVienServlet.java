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
 * Servlet implementation class ChiTietBaiDangThanhVienServlet
 */
public class ChiTietBaiDangThanhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietBaiDangThanhVienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BaiDangBO baiDangBO = new BaiDangBO();
		String maBaiDangUrl = request.getParameter("maBaiDangUrl");
		// lay du lieu chi tiet bai dang bang ma bai dang:
		BaiDang baiDang=baiDangBO.chiTietBaiDang(maBaiDangUrl);
		request.setAttribute("baiDang", baiDang);
		// finally:
		RequestDispatcher rd = request
				.getRequestDispatcher("chitietbaidang.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
