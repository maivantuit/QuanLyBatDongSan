package model.bo;

import java.util.ArrayList;

import model.bean.ThanhVien;
import model.dao.ThanhVienDAO;

public class ThanhVienBO {
	ThanhVienDAO thanhVienDAO = new ThanhVienDAO();

	// get data from table ThanhVien:
	public ArrayList<ThanhVien> danhSachThanhVien() {
		return thanhVienDAO.danhSachThanhVien();
	}

	// get data from table ThanhVien by MaThanhVien:
	public ThanhVien thanhVienCode(String maThanhVien) {
		return thanhVienDAO.thanhVienCode(maThanhVien);
	}

	// get data from table ThanhVien by ma bai dang:
	public ThanhVien thanhVienCodeBaiDang(String maBaiDang) {
		return thanhVienDAO.thanhVienCodeBaiDang(maBaiDang);
	}
}
