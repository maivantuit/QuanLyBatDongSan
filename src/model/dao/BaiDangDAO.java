package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.BaiDang;

import connection.DBConnect;

public class BaiDangDAO {
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return baiDang;
	}
	public static void main(String[] args) {
		BaiDangDAO b = new BaiDangDAO();
		
		BaiDang baiDang1 = b.chiTietBaiDang("1");
		System.out.println(baiDang1.getGia());
		System.out.println(baiDang1.getTrangThai());
		ArrayList<BaiDang> list= b.danhSachBaiDangCodeTrangThai("Chờ phê duyệt");
		for(BaiDang item:list){
			System.out.println(item.getMaBaiDang()+" "+item.getTrangThai());
		}
	}
}
