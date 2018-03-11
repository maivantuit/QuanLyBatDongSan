package model.bo;

import model.dao.ThongDiepDAO;

public class ThongDiepBO {
	ThongDiepDAO thongDiepDAO = new ThongDiepDAO();

	// them moi thong diep moi:
	public boolean themThongDiepMoi(String maBaiDang, String tenNguoiGui,
			String gmailNguoiGui, String sdtNguoiGui) {
		return thongDiepDAO.themThongDiepMoi(maBaiDang, tenNguoiGui,
				gmailNguoiGui, sdtNguoiGui);
	}
}
