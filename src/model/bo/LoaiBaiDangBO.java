package model.bo;

import java.util.ArrayList;

import model.bean.LoaiBaiDang;
import model.dao.LoaiBaiDangDAO;

public class LoaiBaiDangBO {
	LoaiBaiDangDAO loaiBangDangDAO = new LoaiBaiDangDAO();
	// lay table Loai Bai Dang:
	public ArrayList<LoaiBaiDang> layDuLieuLoaiBaiDang() {
		return loaiBangDangDAO.layDuLieuLoaiBaiDang();
	}
}
