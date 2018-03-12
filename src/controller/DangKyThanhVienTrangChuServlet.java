package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.ThanhVienBO;

/**
 * Servlet implementation class DangKyThanhVienTrangChuServlet
 */
public class DangKyThanhVienTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangKyThanhVienTrangChuServlet() {
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
		ThanhVienBO thanhVienBO = new ThanhVienBO();

		// khi nhan submit
		if ("submit".equals(request.getParameter("submit"))) {
			String tenThanhVien = request.getParameter("tenthanhvien");
			String email = request.getParameter("email");
			String passWord = request.getParameter("nhaplaimatkhau");
			String diaChi = request.getParameter("diachi");
			String sdt = request.getParameter("sdt");
			boolean checkThem = thanhVienBO.themThanhVienMoi(tenThanhVien,
					email, passWord, diaChi, sdt);
			String result =null;
			if (checkThem) {
				result = "Thêm thành viên thành công";
				request.setAttribute("result", result);
				RequestDispatcher rd = request
						.getRequestDispatcher("dangkythanhvien.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("dangkythanhvien.jsp");
				rd.forward(request, response);				
			}
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("dangkythanhvien.jsp");
			rd.forward(request, response);
		}
	}

}
