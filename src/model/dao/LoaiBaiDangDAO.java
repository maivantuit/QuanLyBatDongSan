package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.BaiDang;
import model.bean.LoaiBaiDang;
import connection.DBConnect;

public class LoaiBaiDangDAO {
	// lay table Loai Bai Dang:
	public ArrayList<LoaiBaiDang> layDuLieuLoaiBaiDang(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from LoaiBaiDang";
		ArrayList<LoaiBaiDang> danhSachLoaiBaiDang= new ArrayList<LoaiBaiDang>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				LoaiBaiDang loaiBaiDang = new LoaiBaiDang();
				loaiBaiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"));
				loaiBaiDang.setTenLoaiBaiDang(rs.getString("TenLoaiBaiDang"));				
				danhSachLoaiBaiDang.add(loaiBaiDang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachLoaiBaiDang;
	}
	public static void main(String[] args) {
		LoaiBaiDangDAO d = new LoaiBaiDangDAO();
		ArrayList<LoaiBaiDang> list=d.layDuLieuLoaiBaiDang();
		for(LoaiBaiDang	 item: list){
			System.out.println(item.getMaLoaiBaiDang());
		}
	}
}
