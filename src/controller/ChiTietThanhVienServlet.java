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
 * Servlet implementation class ChiTietThanhVienServlet
 */
public class ChiTietThanhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietThanhVienServlet() {
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
		BaiDangBO baiDangBO = new BaiDangBO();
		// get ma thanh vien tu thanh url:
		String maThanhVien = request.getParameter("maThanhVienUrl");
		// lay thanh vien bang ma thanh vien:				
		ThanhVien thanhVien = thanhVienBO.thanhVienCode(maThanhVien);
		request.setAttribute("thanhVien", thanhVien);
		// lay du lieu tu database tu bang BaiDang dua theo ma thanh vien:
		ArrayList<BaiDang> listBaiDangCode = baiDangBO.layDuLieuBaiDangBangCode(maThanhVien);
		request.setAttribute("listBaiDangCode", listBaiDangCode);
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("admin/detailmembers.jsp");
		rd.forward(request, response);
	}

}
