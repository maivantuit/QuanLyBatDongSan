package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.bean.Admin;
import model.bean.ThanhVien;
import connection.DBConnect;

public class AdminDAO {
	// cap nhat thong tin ca nhan:
	public boolean capNhatThongTinAdmin(String adminName,String capDo,String adminID){
		Connection con = DBConnect.getConnection();
		String sql = String.format("update Admins set AdminName = '%s', CapDo = '%s' where AdminID = '%s'",adminName,capDo,adminID);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	// get admin voi ma id admin:
	public Admin adminCode(String maAdmin){
		Connection con = DBConnect.getConnection();
		String sql = String.format("select * from Admins where AdminID = '%s'", maAdmin);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Admin admin = new Admin();
		try {
			while(rs.next()){
				admin.setAdminID(rs.getString("AdminID"));
				admin.setMatKhau(rs.getString("Password"));
				admin.setAdminName(rs.getString("AdminName"));
				admin.setCapDo(rs.getString("CapDo"));						
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin;
	}
	// doi mat khau admin:
	public boolean doiMatKhauAdmin(String matKhau,String idAdmin){
		Connection con = DBConnect.getConnection();
		String sql = String.format("update Admins set  Password = '%s' where AdminID = '%S'",matKhau,idAdmin);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		AdminDAO d = new AdminDAO();
		 d.doiMatKhauAdmin("123", "admin");
		
		
	}
}
