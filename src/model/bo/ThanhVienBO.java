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

	// dang nhap thanh vien:
	public ThanhVien dangNhap(String email, String matKhau) {
		return thanhVienDAO.dangNhap(email, matKhau);
	}

	// dang ky 1 thanh vien moi:
	public boolean themThanhVienMoi(String tenThanhVien, String email,
			String passWord, String diaChi, String sdt) {
		return thanhVienDAO.themThanhVienMoi(tenThanhVien, email, passWord,
				diaChi, sdt);
	}
}
