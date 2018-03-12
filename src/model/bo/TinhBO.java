package model.bo;

import java.util.ArrayList;

import model.bean.Tinh;
import model.dao.TinhDAO;

public class TinhBO {
	TinhDAO tinhDAO = new TinhDAO();

	// lay du lieu tinh:
	public ArrayList<Tinh> layDuLieuTinh() {
		return tinhDAO.layDuLieuTinh();
	}
}
