package model.dao;

import java.sql.Connection;
import java.sql.Statement;

import connection.DBConnect;

public class ThongDiepDAO {
	// them moi thong diep moi:
	public boolean themThongDiepMoi(String maBaiDang, String tenNguoiGui,
			String gmailNguoiGui, String sdtNguoiGui) {
		Connection con = DBConnect.getConnection();
		String sql = String.format(
				"insert into ThongDiep values('%s',N'%s','%s','%s')",
				maBaiDang, tenNguoiGui, gmailNguoiGui, sdtNguoiGui);
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
		ThongDiepDAO d= new ThongDiepDAO();
		d.themThongDiepMoi("2", "Cop", "cop@gmail.com", "09777727372");
	}
}
