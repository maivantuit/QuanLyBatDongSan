package model.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DBConnect;

public class DangNhapAdminDAO {
	// dang nhap admin:
	public boolean checkLogin(String tenDangNhap, String matKhau){
		Connection con = DBConnect.getConnection();
		String sql = String.format("SELECT AdminID FROM Admins WHERE AdminID = '%s' AND Password = '%s'", tenDangNhap, matKhau);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		DangNhapAdminDAO d = new DangNhapAdminDAO();
		boolean check = d.checkLogin("adminmain", "123");
		if(check){
			System.out.println("oke men");
		}else{
			System.out.println("no men");
		}
	}
}
