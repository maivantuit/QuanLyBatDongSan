package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.DangNhapAdminBO;

/**
 * Servlet implementation class DangNhapAdminServlet
 */
public class DangNhapAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhapAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("admin/login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// dang nhap:
		request.setCharacterEncoding("UTF-8");
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau = request.getParameter("matKhau");
		DangNhapAdminBO dangNhapAdminBO = new DangNhapAdminBO();
		if(dangNhapAdminBO.checkLogin(tenDangNhap, matKhau)){		
			HttpSession session = request.getSession();
			session.setAttribute("tenDangNhap", tenDangNhap);
			response.sendRedirect("TrangChuServlet");
		}else{
			request.setAttribute("thongBao", "Dang nhap khong thanh cong.");
			RequestDispatcher rd = request.getRequestDispatcher("admin/login.jsp");
			rd.forward(request, response);
		}
	}

}
