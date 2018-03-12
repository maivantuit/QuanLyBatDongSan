package model.bean;

public class PhuongXa {
	private String maPhuongXa;
	private String tenPhuongXa;
	private String maQuanHuyen;
	/**
	 * 
	 */
	public PhuongXa() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maPhuongXa
	 * @param tenPhuongXa
	 * @param maQuanHuyen
	 */
	public PhuongXa(String maPhuongXa, String tenPhuongXa, String maQuanHuyen) {
		super();
		this.maPhuongXa = maPhuongXa;
		this.tenPhuongXa = tenPhuongXa;
		this.maQuanHuyen = maQuanHuyen;
	}
	/**
	 * @return the maPhuongXa
	 */
	public String getMaPhuongXa() {
		return maPhuongXa;
	}
	/**
	 * @param maPhuongXa the maPhuongXa to set
	 */
	public void setMaPhuongXa(String maPhuongXa) {
		this.maPhuongXa = maPhuongXa;
	}
	/**
	 * @return the tenPhuongXa
	 */
	public String getTenPhuongXa() {
		return tenPhuongXa;
	}
	/**
	 * @param tenPhuongXa the tenPhuongXa to set
	 */
	public void setTenPhuongXa(String tenPhuongXa) {
		this.tenPhuongXa = tenPhuongXa;
	}
	/**
	 * @return the maQuanHuyen
	 */
	public String getMaQuanHuyen() {
		return maQuanHuyen;
	}
	/**
	 * @param maQuanHuyen the maQuanHuyen to set
	 */
	public void setMaQuanHuyen(String maQuanHuyen) {
		this.maQuanHuyen = maQuanHuyen;
	}
	
}
