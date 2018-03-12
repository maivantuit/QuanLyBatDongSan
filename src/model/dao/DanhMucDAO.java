package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.Huong;
import model.bean.DanhMuc;
import connection.DBConnect;

public class DanhMucDAO {
	// lay du lieu table Danhmuc:
	public ArrayList<DanhMuc> layDuLieuDanhMuc(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from DanhMuc";
		ArrayList<DanhMuc> danhSachDanhMuc= new ArrayList<DanhMuc>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				DanhMuc danhMuc = new DanhMuc();
				danhMuc.setMaDanhMuc(rs.getString("MaDanhMuc"));
				danhMuc.setTenDanhMuc(rs.getString("TenDanhMuc"));				
				danhSachDanhMuc.add(danhMuc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachDanhMuc;
	}
	public static void main(String[] args) {
		DanhMucDAO h = new DanhMucDAO();
		ArrayList<DanhMuc>  list = h.layDuLieuDanhMuc();
		for(DanhMuc item :list){
			System.out.println(item.getMaDanhMuc());
		}
		
	}
}
