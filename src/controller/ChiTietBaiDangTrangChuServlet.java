package controller;

import java.io.IOException;

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
 * Servlet implementation class ChiTietBaiDangTrangChuServlet
 */
public class ChiTietBaiDangTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietBaiDangTrangChuServlet() {
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
		ThanhVienBO thanhVienBO = new ThanhVienBO();
		// lay ma bai dang tu url top.jsp:
		String maBaiDangURL = request.getParameter("maBaiDangURL");
		BaiDang baiDang=baiDangBO.chiTietBaiDangTrangChu(maBaiDangURL);
		request.setAttribute("baiDang", baiDang);
		
		// lay thanh vien tu ma bai dang url:
		ThanhVien thanhVien = thanhVienBO.thanhVienCodeBaiDang(maBaiDangURL);
		request.setAttribute("thanhVien", thanhVien);
		//finally:
		RequestDispatcher rd = request.getRequestDispatcher("chitietbatdongsan.jsp");
		rd.forward(request, response);
		
	}

}
