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
	
	// lay bang bai dang join chi tiet show len trang chu:
	public ArrayList<BaiDang> layDuLieuBaiDangJoinChiTietBangDang(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from BaiDang join ChiTietBaiDang on BaiDang.MaBaiDang = ChiTietBaiDang.MaBaiDang  where TrangThai = N'Đang rao' or TrangThai = N'Kết thúc rao' ";
		ArrayList<BaiDang> danhSachBaiDang= new ArrayList<BaiDang>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				BaiDang baiDang = new BaiDang();
				baiDang.setMaBaiDang(rs.getString("MaBaiDang"));
				baiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"))	;			
				baiDang.setMaHuong(rs.getString("MaHuong"));
				baiDang.setMaDanhMuc(rs.getString("MaDanhMuc"));
				baiDang.setMaTinh(rs.getString("MaTinh"));
				baiDang.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				baiDang.setMaPhuongXa(rs.getString("MaPhuongXa"));
				baiDang.setTenBaiDang(rs.getString("TenBaiDang"));					
				baiDang.setGia(rs.getString("Gia"));
				baiDang.setDienTich(rs.getString("DienTich"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setHinhAnh(rs.getString("HinhAnh"));
				baiDang.setTrangThai(rs.getString("TrangThai"));
				baiDang.setThoiGian(rs.getString("ThoiGianDang"));				
				baiDang.setDiaChi(rs.getString("DiaChi"));
				baiDang.setMoTa(rs.getString("MoTa"));
				danhSachBaiDang.add(baiDang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachBaiDang;
	}
	// lay chi tiet bai dang trang chu:
	public BaiDang chiTietBaiDangTrangChu(String maBaiDang){
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
				baiDang.setMaLoaiBaiDang(rs.getString("MaLoaiBaiDang"))	;			
				baiDang.setMaHuong(rs.getString("MaHuong"));
				baiDang.setMaDanhMuc(rs.getString("MaDanhMuc"));
				baiDang.setMaTinh(rs.getString("MaTinh"));
				baiDang.setMaQuanHuyen(rs.getString("MaQuanHuyen"));
				baiDang.setMaPhuongXa(rs.getString("MaPhuongXa"));
				baiDang.setTenBaiDang(rs.getString("TenBaiDang"));								
				baiDang.setGia(rs.getString("Gia"));
				baiDang.setDienTich(rs.getString("DienTich"));
				baiDang.setMaThanhVien(rs.getString("MaThanhVien"));
				baiDang.setHinhAnh(rs.getString("HinhAnh"));
				baiDang.setTrangThai(rs.getString("TrangThai"));
				baiDang.setThoiGian(rs.getString("ThoiGianDang"));				
				baiDang.setDiaChi(rs.getString("DiaChi"));
				baiDang.setMoTa(rs.getString("MoTa"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return baiDang;
	}
	// them moi bai dang: BaiDang - ChiTietBaiDang:
	public String themBaiDang(String maLoaiBaiDang, String maThanhVien,
			String maHuong, String maDanhMuc, String maTinh,
			String maQuanHuyen, String maPhuongXa, String tenBaiDang,
			String trangThai, String gia, String dienTich,
			String donVi, String hinhAnh, String diaChi,
		String moTa) {
		String str = new String();
		Connection con = DBConnect.getConnection();
		trangThai = "Chờ phê duyệt";
		try{
			PreparedStatement p1 = con.prepareStatement("insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa) values(?,?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);			
			p1.setString(1, maLoaiBaiDang);
			p1.setString(2, maThanhVien);
			p1.setString(3, maHuong);
			p1.setString(4, maDanhMuc);
			p1.setString(5, maTinh);
			p1.setString(6, maQuanHuyen);
			p1.setString(7, maPhuongXa);
			p1.setString(8, tenBaiDang);
			p1.setString(9, trangThai);
			p1.setString(10, moTa);
			p1.executeUpdate();
			ResultSet rs = p1.getGeneratedKeys();
			String maBaiDangCuoi;
			if(rs.next()){
				maBaiDangCuoi = rs.getString(1);
				// goi la ham them chi tiet:
				String check=themChiTietBaiDang(maBaiDangCuoi, gia, dienTich, hinhAnh, diaChi);
				if(check.equals("Chèn thành công")){
					str ="Chèn thành công";
				}else{
					str ="Chèn không thành công";
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
				
		return str;
	}
	// them moi bai dang: BaiDang - ChiTietBaiDang:
		public String themChiTietBaiDang(String maBaiDang, String gia, String dienTich,
				String hinhAnh,  String diaChi
				) {
			
			Connection con = DBConnect.getConnection();
			String str = new String();
			hinhAnh ="images/baidang7.jpg";
			try{
				PreparedStatement p1 = con.prepareStatement("insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,DiaChi) values(?,?,?,?,?)");
				p1.setString(1, maBaiDang);
				p1.setString(2, gia);
				p1.setString(3, dienTich);
				p1.setString(4, hinhAnh);
				p1.setString(5, diaChi);				
				int ok=p1.executeUpdate();
				if(ok !=0){
					str= "Chèn thành công";
				}else{
					str= "Chèn không thành công";
				}
			}catch(Exception e){
				e.printStackTrace();
			}
						
			return str;
		}
	
	public static void main(String[] args) {
		BaiDangDAO b = new BaiDangDAO();		
		//b.themBaiDang( "LBD01", "1", "H01", "DM01", "T01", "Q01", "PX01", "abc", "Trang thai ne", "2302322", "12m2", "chiec", "images/abc.jpg",  "Qtri",  "mo ta abc");
		ArrayList<BaiDang> list=b.layDuLieuBaiDangJoinChiTietBangDang();
		for(BaiDang item:list){
			System.out.println(item.getMaBaiDang());
		}
	}
	
}
