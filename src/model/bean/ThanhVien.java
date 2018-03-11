package model.bean;

public class ThanhVien {
	private String maThanhVien;
	private String tenThanhVien;
	private String email;
	private String passWord;
	private String diaChi;
	private String sdt;
	private String anhDaiDien;
	public ThanhVien(){}
	public ThanhVien(String maThanhVien){
		this.maThanhVien = maThanhVien;
	}
	/**
	 * @param maThanhVien
	 * @param tenThanhVien
	 * @param email
	 * @param passWord
	 * @param diaChi
	 * @param sdt
	 * @param anhDaiDien
	 */	
	public ThanhVien(String maThanhVien, String tenThanhVien, String email,
			String passWord, String diaChi, String sdt, String anhDaiDien) {
		super();
		this.maThanhVien = maThanhVien;
		this.tenThanhVien = tenThanhVien;
		this.email = email;
		this.passWord = passWord;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.anhDaiDien = anhDaiDien;
	}
	/**
	 * @return the maThanhVien
	 */
	public String getMaThanhVien() {
		return maThanhVien;
	}
	/**
	 * @param maThanhVien the maThanhVien to set
	 */
	public void setMaThanhVien(String maThanhVien) {
		this.maThanhVien = maThanhVien;
	}
	/**
	 * @return the tenThanhVien
	 */
	public String getTenThanhVien() {
		return tenThanhVien;
	}
	/**
	 * @param tenThanhVien the tenThanhVien to set
	 */
	public void setTenThanhVien(String tenThanhVien) {
		this.tenThanhVien = tenThanhVien;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the sdt
	 */
	public String getSdt() {
		return sdt;
	}
	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	/**
	 * @return the anhDaiDien
	 */
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	/**
	 * @param anhDaiDien the anhDaiDien to set
	 */
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	
}
