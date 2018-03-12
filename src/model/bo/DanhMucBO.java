package model.bo;

import java.util.ArrayList;

import model.bean.DanhMuc;
import model.dao.DanhMucDAO;

public class DanhMucBO {
	DanhMucDAO danhMucDAO = new DanhMucDAO();

	// lay du lieu table Danhmuc:
	public ArrayList<DanhMuc> layDuLieuDanhMuc() {
		return danhMucDAO.layDuLieuDanhMuc();
	}
}
