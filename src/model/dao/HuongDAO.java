package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.Huong;
import model.bean.LoaiBaiDang;
import connection.DBConnect;

public class HuongDAO {
	// lay table Huong:
	public ArrayList<Huong> layDuLieuHuong(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from Huong";
		ArrayList<Huong> danhSachHuong= new ArrayList<Huong>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Huong huong = new Huong();
				huong.setMaHuong(rs.getString("MaHuong"));
				huong.setTenHuong(rs.getString("TenHuong"));				
				danhSachHuong.add(huong);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachHuong;
	}
	public static void main(String[] args) {
		HuongDAO h = new HuongDAO();
		ArrayList<Huong>  list = h.layDuLieuHuong();
		for(Huong item :list){
			System.out.println(item.getMaHuong());
		}
		
	}
}
