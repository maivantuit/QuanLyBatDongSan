package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.DanhMuc;
import model.bean.Tinh;
import connection.DBConnect;

public class TinhDAO {
	// lay du lieu tinh:
	public ArrayList<Tinh> layDuLieuTinh(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from Tinh";
		ArrayList<Tinh> danhSachTinh= new ArrayList<Tinh>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Tinh tinh = new Tinh();
				tinh.setMaTinh(rs.getString("MaTinh"));
				tinh.setTenTinh(rs.getString("TenTinh"));				
				danhSachTinh.add(tinh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachTinh;
	}
	public static void main(String[] args) {
		TinhDAO h = new TinhDAO();
		ArrayList<Tinh>  list = h.layDuLieuTinh();
		for(Tinh item :list){
			System.out.println(item.getMaTinh());
		}
		
	}
}
