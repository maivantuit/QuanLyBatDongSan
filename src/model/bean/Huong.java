package model.bean;

public class Huong {
	private String maHuong;
	private String tenHuong;
	/**
	 * 
	 */
	public Huong() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maHuong
	 * @param tenHuong
	 */
	public Huong(String maHuong, String tenHuong) {
		super();
		this.maHuong = maHuong;
		this.tenHuong = tenHuong;
	}
	/**
	 * @return the maHuong
	 */
	public String getMaHuong() {
		return maHuong;
	}
	/**
	 * @param maHuong the maHuong to set
	 */
	public void setMaHuong(String maHuong) {
		this.maHuong = maHuong;
	}
	/**
	 * @return the tenHuong
	 */
	public String getTenHuong() {
		return tenHuong;
	}
	/**
	 * @param tenHuong the tenHuong to set
	 */
	public void setTenHuong(String tenHuong) {
		this.tenHuong = tenHuong;
	}
	
}
