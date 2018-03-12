package model.bo;

import java.util.ArrayList;

import model.bean.PhuongXa;
import model.dao.PhuongXaDAO;

public class PhuongXaBO {
	PhuongXaDAO phuongXaDAO = new PhuongXaDAO();

	// lay du lieu phuongxa:
	public ArrayList<PhuongXa> layDuLieuPhuongXa() {
		return phuongXaDAO.layDuLieuPhuongXa();
	}
}
