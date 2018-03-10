package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Admin;
import model.bo.AdminBO;

/**
 * Servlet implementation class CapNhatThongTinAdminServlet
 */
public class CapNhatThongTinAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CapNhatThongTinAdminServlet() {
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
		//
		AdminBO adminBO = new AdminBO();
		// lay tu url cua menu: cap nhat thong tin ca nhan.
		String maIDAdminURL = request.getParameter("maIDAdminURL");

		// get du lieu table admin:
		Admin admin = adminBO.adminCode(maIDAdminURL);
		request.setAttribute("admin", admin);
		
		// khi nhat submid cap nhat thong tin:
		if ("submit".equals(request.getParameter("submit"))) {
			String adminName = request.getParameter("adminName");
			String idAdmin = request.getParameter("idadmin");
			String capDo = request.getParameter("capDo");
			System.out.println(adminName);
			System.out.println(capDo);
			System.out.println(maIDAdminURL);
			adminBO.capNhatThongTinAdmin(adminName, capDo, idAdmin);		
			response.sendRedirect("TrangChuServlet");
		} else {
			// finally:
			RequestDispatcher rd = request
					.getRequestDispatcher("admin/capnhatthongtinadmin.jsp");
			rd.forward(request, response);
		}
	}

}
