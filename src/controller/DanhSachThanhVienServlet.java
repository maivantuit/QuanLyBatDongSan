package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ThanhVien;
import model.bo.ThanhVienBO;

/**
 * Servlet implementation class DanhSachThanhVienServlet
 */
public class DanhSachThanhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachThanhVienServlet() {
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
		ThanhVienBO thanhVienBO = new ThanhVienBO();
		// lay danh sach thanh vien:
		ArrayList<ThanhVien> danhSachThanhVien = thanhVienBO.danhSachThanhVien();
		request.setAttribute("danhSachThanhVien", danhSachThanhVien);
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("admin/managemembers.jsp");
		rd.forward(request, response);
	}

}
