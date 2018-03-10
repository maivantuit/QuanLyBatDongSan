package model.bo;

import model.bean.Admin;
import model.dao.AdminDAO;

public class AdminBO {
	AdminDAO adminDAO = new AdminDAO();

	// cap nhat thong tin ca nhan:
	public boolean capNhatThongTinAdmin(String adminName, String capDo,
			String adminID) {
		return adminDAO.capNhatThongTinAdmin(adminName, capDo, adminID);
	}

	// get admin voi ma id admin:
	public Admin adminCode(String maAdmin) {
		return adminDAO.adminCode(maAdmin);
	}
	// doi mat khau admin:
		public boolean doiMatKhauAdmin(String matKhau,String idAdmin){
			return adminDAO.doiMatKhauAdmin(matKhau, idAdmin);
		}
}
