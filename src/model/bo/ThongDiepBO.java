package model.bo;

import java.util.ArrayList;

import model.bean.ThongDiep;
import model.dao.ThongDiepDAO;

public class ThongDiepBO {
	ThongDiepDAO thongDiepDAO = new ThongDiepDAO();

	// them moi thong diep moi:
	public boolean themThongDiepMoi(String maBaiDang, String tenNguoiGui,
			String gmailNguoiGui, String sdtNguoiGui) {
		return thongDiepDAO.themThongDiepMoi(maBaiDang, tenNguoiGui,
				gmailNguoiGui, sdtNguoiGui);
	}

	// show table ThongDiep:
	public ArrayList<ThongDiep> layDuLieuThongDiep() {
		return thongDiepDAO.layDuLieuThongDiep();
	}
}
