package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ThongDiep;
import model.bean.Tinh;

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
	// show table ThongDiep:
	public ArrayList<ThongDiep> layDuLieuThongDiep(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from ThongDiep";
		ArrayList<ThongDiep> danhSachThongDiep= new ArrayList<ThongDiep>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				ThongDiep thongDiep = new ThongDiep();
				thongDiep.setMaThongDiep(rs.getString("MaThongDiep"));
				thongDiep.setMaBaiDang(rs.getString("MaBaiDang"));
				thongDiep.setTenNguoiGui(rs.getString("TenNguoiGui"));
				thongDiep.setGmailNguoiGui(rs.getString("GmailNguoiGui"));
				thongDiep.setSdtNguoiGui(rs.getString("SDTNguoiGui"));				
				danhSachThongDiep.add(thongDiep);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachThongDiep;
	}
	public static void main(String[] args) {
		ThongDiepDAO d= new ThongDiepDAO();
		d.themThongDiepMoi("2", "Cop", "cop@gmail.com", "09777727372");
	}
}
