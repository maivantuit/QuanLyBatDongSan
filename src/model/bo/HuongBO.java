package model.bo;

import java.util.ArrayList;

import model.bean.Huong;
import model.dao.HuongDAO;

public class HuongBO {
	HuongDAO huongDAO = new HuongDAO();

	// lay table Huong:
	public ArrayList<Huong> layDuLieuHuong() {
		return huongDAO.layDuLieuHuong();
	}
}
