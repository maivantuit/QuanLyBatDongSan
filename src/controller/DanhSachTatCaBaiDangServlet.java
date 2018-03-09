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
 * Servlet implementation class DanhSachTatCaBaiDangServlet
 */
public class DanhSachTatCaBaiDangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachTatCaBaiDangServlet() {
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
		BaiDangBO baiDangBO = new BaiDangBO();
		
		// lay du lieu bang bai dang:
		ArrayList<BaiDang> danhSachTatCaBaiDang = baiDangBO.layDuLieuBaiDang();
		request.setAttribute("danhSachTatCaBaiDang", danhSachTatCaBaiDang);
		// finally
		RequestDispatcher rd = request.getRequestDispatcher("admin/listallpost.jsp");
		rd.forward(request, response);
	}

}
