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
	public boolean capNhatTrangThaiBaiDang(String trangThai,String maBaiDang){
		return baiDangDAO.capNhatTrangThaiBaiDang(trangThai, maBaiDang);
	}
}
