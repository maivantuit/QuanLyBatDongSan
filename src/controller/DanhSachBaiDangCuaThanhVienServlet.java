package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.BaiDang;
import model.bo.BaiDangBO;

/**
 * Servlet implementation class DanhSachBaiDangCuaThanhVienServlet
 */
public class DanhSachBaiDangCuaThanhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachBaiDangCuaThanhVienServlet() {
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
		BaiDangBO baiDangBO = new BaiDangBO();
		// lay ma thanh vien tu thanh URL:
		String maThanhVien = request.getParameter("maThanhVienUrl");
		// lay du lieu tu database tu bang BaiDang dua theo ma thanh vien:
		ArrayList<BaiDang> listBaiDang = baiDangBO.layDuLieuBaiDangBangCode(maThanhVien);
		
		
	}

}
