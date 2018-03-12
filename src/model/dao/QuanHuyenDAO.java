package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.QuanHuyen;
import model.bean.Tinh;
import connection.DBConnect;

public class QuanHuyenDAO {
	// lay table QuanHuyen:
	public ArrayList<QuanHuyen> layDuLieuQuanHuyen(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from QuanHuyen";
		ArrayList<QuanHuyen> danhSachQuanHuyen= new ArrayList<QuanHuyen>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				QuanHuyen quanHuyen = new QuanHuyen();
				quanHuyen.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				quanHuyen.setTenQuanHuyen(rs.getString("TenQuanHuyen"));		
				quanHuyen.setMaTinh(rs.getString("MaTinh"));
				danhSachQuanHuyen.add(quanHuyen);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachQuanHuyen;
	}
	public static void main(String[] args) {
		QuanHuyenDAO h = new QuanHuyenDAO();
		ArrayList<QuanHuyen>  list = h.layDuLieuQuanHuyen();
		for(QuanHuyen item :list){
			System.out.println(item.getMaTinh());
		}
		
	}
}
