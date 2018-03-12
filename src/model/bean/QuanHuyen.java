package model.bean;

public class QuanHuyen {
	private String maQuanHuyen;
	private String tenQuanHuyen;
	private String maTinh;
	/**
	 * 
	 */
	public QuanHuyen() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maQuanHuyen
	 * @param tenQuanHuyen
	 * @param maTinh
	 */
	public QuanHuyen(String maQuanHuyen, String tenQuanHuyen, String maTinh) {
		super();
		this.maQuanHuyen = maQuanHuyen;
		this.tenQuanHuyen = tenQuanHuyen;
		this.maTinh = maTinh;
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
	/**
	 * @return the tenQuanHuyen
	 */
	public String getTenQuanHuyen() {
		return tenQuanHuyen;
	}
	/**
	 * @param tenQuanHuyen the tenQuanHuyen to set
	 */
	public void setTenQuanHuyen(String tenQuanHuyen) {
		this.tenQuanHuyen = tenQuanHuyen;
	}
	/**
	 * @return the maTinh
	 */
	public String getMaTinh() {
		return maTinh;
	}
	/**
	 * @param maTinh the maTinh to set
	 */
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}
	
}
