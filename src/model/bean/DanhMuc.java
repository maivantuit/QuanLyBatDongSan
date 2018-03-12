package model.bean;

public class DanhMuc {
	private String maDanhMuc;
	private String tenDanhMuc;
	/**
	 * 
	 */
	public DanhMuc() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maDanhMuc
	 * @param tenDanhMuc
	 */
	public DanhMuc(String maDanhMuc, String tenDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
	}
	/**
	 * @return the maDanhMuc
	 */
	public String getMaDanhMuc() {
		return maDanhMuc;
	}
	/**
	 * @param maDanhMuc the maDanhMuc to set
	 */
	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	/**
	 * @return the tenDanhMuc
	 */
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	/**
	 * @param tenDanhMuc the tenDanhMuc to set
	 */
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	
}
