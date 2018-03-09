package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.lookup.CaptureBinding;

import model.bean.BaiDang;


import connection.DBConnect;

public class BaiDangDAO {
	// lay du lieu bang baidang:
	public ArrayList<BaiDang> layDuLieuBaiDang(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from BaiDang";
		ArrayList<BaiDang> danhSachBaiDang= new ArrayList<BaiDang>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				BaiDang baiDang = new BaiDang();
				baiDang.setMaBaiDang(rs.getString("MaBaiDang"));
				baiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setMaHuong(rs.getString("MaHuong"));
				baiDang.setMaDanhMuc(rs.getString("MaDanhMuc"));
				baiDang.setMaTinh(rs.getString("MaTinh"));
				baiDang.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				baiDang.setMaPhuongXa(rs.getString("MaPhuongXa"));
				baiDang.setTenBaiDang(rs.getString("TenBaiDang"));
				baiDang.setTrangThai(rs.getString("TrangThai"));
						
				danhSachBaiDang.add(baiDang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachBaiDang;
	}
	// lay du lieu tu database tu bang BaiDang dua theo ma thanh vien:
	public ArrayList<BaiDang> layDuLieuBaiDangBangCode(String maThanhVien){
		Connection con = DBConnect.getConnection();
		String sql = String.format("select * from BaiDang where MaThanhVien = '%s'", maThanhVien);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 ArrayList<BaiDang> listBaiDang = new ArrayList<BaiDang>();
		try{
			while(rs.next()){
				BaiDang baiDang = new BaiDang();
				baiDang.setMaBaiDang(rs.getString("MaBaiDang"));
				baiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setMaHuong(rs.getString("MaHuong"));
				baiDang.setMaDanhMuc(rs.getString("MaDanhMuc"));
				baiDang.setMaTinh(rs.getString("MaTinh"));
				baiDang.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				baiDang.setMaPhuongXa(rs.getString("MaPhuongXa"));
				baiDang.setTenBaiDang(rs.getString("TenBaiDang"));
				baiDang.setTrangThai(rs.getString("TrangThai"));	
				
				listBaiDang.add(baiDang);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listBaiDang;
	}
	// lay du lieu tu database cua table BaiDang voi ma la trang thai:
	public ArrayList<BaiDang> danhSachBaiDangCodeTrangThai(String trangThai){
		Connection con = DBConnect.getConnection();
		String sql = String.format("select * from BaiDang where TrangThai = N'%s'", trangThai);
		ResultSet rs = null;
		try{
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<BaiDang> listBaiDang = new ArrayList<BaiDang>();
		try {
			while(rs.next()){
				BaiDang baiDang = new BaiDang();
				baiDang.setMaBaiDang(rs.getString("MaBaiDang"));
				baiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setMaHuong(rs.getString("MaHuong"));
				baiDang.setMaDanhMuc(rs.getString("MaDanhMuc"));
				baiDang.setMaTinh(rs.getString("MaTinh"));
				baiDang.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				baiDang.setMaPhuongXa(rs.getString("MaPhuongXa"));
				baiDang.setTenBaiDang(rs.getString("TenBaiDang"));
				baiDang.setTrangThai(rs.getString("TrangThai"));	
				
				listBaiDang.add(baiDang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBaiDang;
	}
	// lay chi tiet bai dang bang ma bai dang:
	public BaiDang chiTietBaiDang(String maBaiDang){
		Connection con = DBConnect.getConnection();
		String sql = String.format("select * from ChiTietBaiDang  join BaiDang on BaiDang.MaBaiDang = ChiTietBaiDang.MaBaiDang join LoaiBaiDang on LoaiBaiDang.MaLoaiBaiDang = BaiDang.MaLoaiBaiDang where ChiTietBaiDang.MaBaiDang = '%s'", maBaiDang);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		BaiDang baiDang = new BaiDang();
		try {
			while(rs.next()){				
				baiDang.setMaBaiDang(rs.getString("MaBaiDang"));
				baiDang.setGia(rs.getString("Gia"));
				baiDang.setDienTich(rs.getString("DienTich"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setHinhAnh(rs.getString("HinhAnh"));
				baiDang.setTrangThai(rs.getString("TrangThai"));
				baiDang.setThoiGian(rs.getString("ThoiGianDang"));				
				baiDang.setDiaChi(rs.getString("DiaChi"));
				baiDang.setTenLoaiBaiDang(rs.getString("TenLoaiBaiDang"));		
				baiDang.setHinhAnh(rs.getString("HinhAnh"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return baiDang;
	}
	// cap nhat duyet bai dang.
	public boolean capNhatTrangThaiBaiDang(String trangThai,String maBaiDang){
		Connection con = DBConnect.getConnection();
		String sql = String.format("update BaiDang set TrangThai = N'%s' where MaBaiDang = '%s'",trangThai,maBaiDang);
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
		BaiDangDAO b = new BaiDangDAO();		
		BaiDang a= b.chiTietBaiDang("10");
		System.out.println(a.getMaBaiDang());
		System.out.println(a.getTrangThai());
		System.out.println(a.getTenBaiDang());	
	}
	
}
