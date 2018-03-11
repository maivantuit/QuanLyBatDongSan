package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.ThanhVien;
import model.bo.ThanhVienBO;

/**
 * Servlet implementation class DangNhapTrangChuServlet
 */
public class DangNhapTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangNhapTrangChuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		ThanhVienBO thanhVienBO = new ThanhVienBO();

		// neu nhan submit tu dangnhap.jsp:
		if ("submit".equals(request.getParameter("submit"))) {
			String email = request.getParameter("email");
			String matKhau = request.getParameter("matkhau");
			ThanhVien thanhVien = thanhVienBO.dangNhap(email, matKhau);

			if (thanhVien != null) {
				// sesstion:
				HttpSession sesstion = request.getSession();
				sesstion.setAttribute("thanhVien", thanhVien);
				// end:
				response.sendRedirect("TrangChuBatDongSanServlet");
			} else {
				String error= "Vui lòng kiểm tra lại email và password!Cọp xin cám ơn!";
				request.setAttribute("error", error);
				RequestDispatcher rd = request
						.getRequestDispatcher("dangnhap.jsp");
				rd.forward(request, response);
				
			}

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
			rd.forward(request, response);
		}

	}

}
