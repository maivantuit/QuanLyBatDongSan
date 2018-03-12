package model.bo;

import java.util.ArrayList;

import model.bean.QuanHuyen;
import model.dao.QuanHuyenDAO;

public class QuanHuyenBO {
	QuanHuyenDAO quanHuyenDAO = new QuanHuyenDAO();

	// lay table QuanHuyen:
	public ArrayList<QuanHuyen> layDuLieuQuanHuyen() {
		return quanHuyenDAO.layDuLieuQuanHuyen();
	}
}
