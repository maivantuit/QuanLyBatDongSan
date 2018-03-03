package model.bo;

import model.dao.DangNhapAdminDAO;

public class DangNhapAdminBO {
	DangNhapAdminDAO dangNhapAdminDAO = new DangNhapAdminDAO();
	// dang nhap admin:
	public boolean checkLogin(String tenDangNhap, String matKhau){
		return dangNhapAdminDAO.checkLogin(tenDangNhap, matKhau);
	}
}
