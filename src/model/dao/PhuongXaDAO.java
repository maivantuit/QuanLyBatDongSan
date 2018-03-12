package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.PhuongXa;
import model.bean.QuanHuyen;
import connection.DBConnect;

public class PhuongXaDAO {
	// lay du lieu phuongxa:
	public ArrayList<PhuongXa> layDuLieuPhuongXa(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from PhuongXa";
		ArrayList<PhuongXa> danhSachPhuongXa= new ArrayList<PhuongXa>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				PhuongXa phuongXa = new PhuongXa();
				phuongXa.setMaPhuongXa(rs.getString("MaPhuongXa"));
				phuongXa.setTenPhuongXa(rs.getString("TenPhuongXa"));		
				phuongXa.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				danhSachPhuongXa.add(phuongXa);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachPhuongXa;
	}
	public static void main(String[] args) {
		PhuongXaDAO h = new PhuongXaDAO();
		ArrayList<PhuongXa>  list = h.layDuLieuPhuongXa();
		for(PhuongXa item :list){
			System.out.println(item.getMaPhuongXa());
		}
		
	}
}
