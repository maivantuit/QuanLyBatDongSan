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
 * Servlet implementation class QuanLyBaiDangTrangChuServlet
 */
public class QuanLyBaiDangTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuanLyBaiDangTrangChuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BaiDangBO baiDangBO = new BaiDangBO();
		// get ma thanh vien tu url menu.jsp:
		String maThanhVien = request.getParameter("maThanhVien");
		// lay du lieu bai dang theo ma thanh vien:
		ArrayList<BaiDang> danhSachBaiDang = baiDangBO
				.layDuLieuBaiDangBangCode(maThanhVien);
		request.setAttribute("danhSachBaiDang", danhSachBaiDang);
		RequestDispatcher rd = request
				.getRequestDispatcher("quanlybaidang.jsp");
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
