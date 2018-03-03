package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ThanhVien;

import connection.DBConnect;

public class ThanhVienDAO {
	// get data from table ThanhVien:
	public ArrayList<ThanhVien> danhSachThanhVien() {
		Connection con = DBConnect.getConnection();
		String sql = "select * from ThanhVien";
		ArrayList<ThanhVien> listThanhVien = new ArrayList<ThanhVien>();
		ResultSet rs;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ThanhVien thanhVien = new ThanhVien();
				thanhVien.setMaThanhVien(rs.getString("MaThanhVien"));
				thanhVien.setTenThanhVien(rs.getString("TenThanhVien"));
				thanhVien.setEmail(rs.getString("Email"));
				thanhVien.setDiaChi(rs.getString("DiaChi"));
				thanhVien.setSdt(rs.getString("SoDienThoai"));
				thanhVien.setAnhDaiDien(rs.getString("AnhDaiDien"));
				listThanhVien.add(thanhVien);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listThanhVien;
	}

	// get data from table ThanhVien by MaThanhVien:
	public ThanhVien thanhVienCode(String maThanhVien){
		Connection con = DBConnect.getConnection();
		String sql = String.format("select  MaThanhVien,TenThanhVien,Email,DiaChi,SoDienThoai,AnhDaiDien   from ThanhVien where MaThanhVien = '%s'", maThanhVien);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ThanhVien thanhVien = new ThanhVien();
		try {
			while(rs.next()){
				thanhVien.setMaThanhVien(maThanhVien);
				thanhVien.setTenThanhVien(rs.getString("TenThanhVien"));
				thanhVien.setEmail(rs.getString("Email"));
				thanhVien.setDiaChi(rs.getString("DiaChi"));
				thanhVien.setSdt(rs.getString("SoDienThoai"));
				thanhVien.setAnhDaiDien(rs.getString("AnhDaiDien"));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thanhVien;
	}

	public static void main(String[] args) {
		ThanhVienDAO thanhVienDAO = new ThanhVienDAO();
		
		ThanhVien tv1 = thanhVienDAO.thanhVienCode("TV001");
		System.out.println(tv1.getMaThanhVien());
		System.out.println(tv1.getEmail());
	}
}