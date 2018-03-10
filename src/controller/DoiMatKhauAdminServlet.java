package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Admin;
import model.bo.AdminBO;
import model.dao.AdminDAO;

/**
 * Servlet implementation class DoiMatKhauAdminServlet
 */
public class DoiMatKhauAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoiMatKhauAdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminBO adminBO = new AdminBO();
		
		// ma admin lay tu url menu doi mat khau:
		String maIDAdminURL = request.getParameter("maIDAdminURL");

		// get du lieu table admin:
		Admin admin = adminBO.adminCode(maIDAdminURL);
		request.setAttribute("admin", admin);
		if ("submit".equals(request.getParameter("submit"))) {
			String matKhau = request.getParameter("nhaplaimatkhaumoi");
			String idAdmin = request.getParameter("maAdmin");
			adminBO.doiMatKhauAdmin(matKhau, idAdmin);
			response.sendRedirect("TrangChuServlet");
		} else {
			// finally:
			RequestDispatcher rd = request
					.getRequestDispatcher("admin/doimatkhau.jsp");
			rd.forward(request, response);
		}

	}

}
