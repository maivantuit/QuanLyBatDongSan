package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.ThongDiepBO;

/**
 * Servlet implementation class ThemThongDiepTrangChuServlet
 */
public class ThemThongDiepTrangChuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemThongDiepTrangChuServlet() {
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
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		ThongDiepBO thongDiepBO = new ThongDiepBO();
		
		
		// khi nhan submit:
		if("submit".equals(request.getParameter("submit"))){
			String maBaiDang = request.getParameter("mabaidang");
			String tenNguoiGui = request.getParameter("tennguoigui");
			String gmailNguoiGui = request.getParameter("gmailnguoigui");
			String sdtNguoiGui = request.getParameter("sdtnguoigui");			
			boolean checkThem=thongDiepBO.themThongDiepMoi(maBaiDang, tenNguoiGui, gmailNguoiGui, sdtNguoiGui);
			if(checkThem=true){				
				String success = "Thêm thông điệp thành công";
				request.setAttribute(success, "success");				
				response.sendRedirect("TrangChuBatDongSanServlet");
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("TrangChuBatDongSanServlet");
				rd.forward(request, response);
			}
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("TrangChuBatDongSanServlet");
			rd.forward(request, response);
		}
	}

}
