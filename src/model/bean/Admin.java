package model.bean;

public class Admin {
	private String adminID;
	private String matKhau;
	private String adminName;
	private String capDo;
	/**
	 * 
	 */
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param adminID
	 * @param matKhau
	 * @param adminName
	 * @param capDo
	 */
	public Admin(String adminID, String matKhau, String adminName, String capDo) {
		super();
		this.adminID = adminID;
		this.matKhau = matKhau;
		this.adminName = adminName;
		this.capDo = capDo;
	}
	/**
	 * @return the adminID
	 */
	public String getAdminID() {
		return adminID;
	}
	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	/**
	 * @return the capDo
	 */
	public String getCapDo() {
		return capDo;
	}
	/**
	 * @param capDo the capDo to set
	 */
	public void setCapDo(String capDo) {
		this.capDo = capDo;
	}
	
}
