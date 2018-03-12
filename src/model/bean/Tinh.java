package model.bean;

public class Tinh {
	private String maTinh;
	private String tenTinh;

	/**
	 * 
	 */
	public Tinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maTinh
	 * @param tenTinh
	 */
	public Tinh(String maTinh, String tenTinh) {
		super();
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	/**
	 * @return the maTinh
	 */
	public String getMaTinh() {
		return maTinh;
	}

	/**
	 * @param maTinh
	 *            the maTinh to set
	 */
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}

	/**
	 * @return the tenTinh
	 */
	public String getTenTinh() {
		return tenTinh;
	}

	/**
	 * @param tenTinh
	 *            the tenTinh to set
	 */
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

}
