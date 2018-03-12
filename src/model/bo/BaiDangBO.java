package model.bo;

import java.util.ArrayList;

import model.bean.BaiDang;
import model.dao.BaiDangDAO;

public class BaiDangBO {
	BaiDangDAO baiDangDAO = new BaiDangDAO();

	// lay du lieu tu database tu bang BaiDang dua theo ma thanh vien:
	public ArrayList<BaiDang> layDuLieuBaiDangBangCode(String maThanhVien) {
		return baiDangDAO.layDuLieuBaiDangBangCode(maThanhVien);
	}

	// lay du lieu tu database cua table BaiDang voi ma la trang thai:
	public ArrayList<BaiDang> danhSachBaiDangCodeTrangThai(String trangThai) {
		return baiDangDAO.danhSachBaiDangCodeTrangThai(trangThai);
	}

	// lay chi tiet bai dang bang ma bai dang:
	public BaiDang chiTietBaiDang(String maBaiDang) {
		return baiDangDAO.chiTietBaiDang(maBaiDang);
	}

	// lay du lieu bang baidang:
	public ArrayList<BaiDang> layDuLieuBaiDang() {
		return baiDangDAO.layDuLieuBaiDang();
	}

	// cap nhat duyet bai dang.
	public boolean capNhatTrangThaiBaiDang(String trangThai, String maBaiDang) {
		return baiDangDAO.capNhatTrangThaiBaiDang(trangThai, maBaiDang);
	}

	// lay bang bai dang join chi tiet show len trang chu:
	public ArrayList<BaiDang> layDuLieuBaiDangJoinChiTietBangDang() {
		return baiDangDAO.layDuLieuBaiDangJoinChiTietBangDang();
	}

	// lay chi tiet bai dang trang chu:
	public BaiDang chiTietBaiDangTrangChu(String maBaiDang) {
		return baiDangDAO.chiTietBaiDangTrangChu(maBaiDang);
	}

	// dang tin:
	// them moi bai dang: BaiDang - ChiTietBaiDang:
	public String themBaiDang(String maBaiDang, String maLoaiBaiDang,
			String maThanhVien, String maHuong, String maDanhMuc,
			String maTinh, String maQuanHuyen, String maPhuongXa,
			String tenBaiDang, String trangThai, String gia, String dienTich,
			String donVi, String hinhAnh, String thoiGian, String diaChi,
			String moTa) {
		return baiDangDAO.themBaiDang(maBaiDang, maLoaiBaiDang, maThanhVien,
				maHuong, maDanhMuc, maTinh, maQuanHuyen, maPhuongXa,
				tenBaiDang, trangThai, gia, dienTich, donVi, hinhAnh, thoiGian,
				diaChi, moTa);
	}
}
