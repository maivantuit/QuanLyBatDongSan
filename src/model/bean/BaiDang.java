package model.bean;

public class BaiDang {
	private String maBaiDang;
	private String maLoaiBaiDang;
	private String maThanhVien;
	private String maHuong;
	private String maDanhMuc;
	private String maTinh;
	private String maQuanHuyen;
	private String maPhuongXa;
	private String tenBaiDang;
	private String trangThai;
	// chi tiet bai dang:
	private String adminID;
	private String gia;
	private String dienTich;
	private String donVi;
	private String hinhAnh;
	private String thoiGian;
	private String diaChi;
	private String tenLoaiBaiDang;
	
	/**
	 * 
	 */
	public BaiDang() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maBaiDang
	 * @param maLoaiBaiDang
	 * @param maThanhVien
	 * @param maHuong
	 * @param maDanhMuc
	 * @param maTinh
	 * @param maQuanHuyen
	 * @param maPhuongXa
	 * @param tenBaiDang
	 * @param trangThai
	 */
	public BaiDang(String maBaiDang, String maLoaiBaiDang, String maThanhVien,
			String maHuong, String maDanhMuc, String maTinh,
			String maQuanHuyen, String maPhuongXa, String tenBaiDang,
			String trangThai) {
		super();
		this.maBaiDang = maBaiDang;
		this.maLoaiBaiDang = maLoaiBaiDang;
		this.maThanhVien = maThanhVien;
		this.maHuong = maHuong;
		this.maDanhMuc = maDanhMuc;
		this.maTinh = maTinh;
		this.maQuanHuyen = maQuanHuyen;
		this.maPhuongXa = maPhuongXa;
		this.tenBaiDang = tenBaiDang;
		this.trangThai = trangThai;
	}
	

	/**
	 * @param maBaiDang
	 * @param maLoaiBaiDang
	 * @param maThanhVien
	 * @param maHuong
	 * @param maDanhMuc
	 * @param maTinh
	 * @param maQuanHuyen
	 * @param maPhuongXa
	 * @param tenBaiDang
	 * @param trangThai
	 * @param adminID
	 * @param gia
	 * @param dienTich
	 * @param donVi
	 * @param hinhAnh
	 * @param thoiGian
	 * @param diaChi
	 */
	public BaiDang(String maBaiDang, String maLoaiBaiDang, String maThanhVien,
			String maHuong, String maDanhMuc, String maTinh,
			String maQuanHuyen, String maPhuongXa, String tenBaiDang,
			String trangThai, String adminID, String gia, String dienTich,
			String donVi, String hinhAnh, String thoiGian, String diaChi) {
		super();
		this.maBaiDang = maBaiDang;
		this.maLoaiBaiDang = maLoaiBaiDang;
		this.maThanhVien = maThanhVien;
		this.maHuong = maHuong;
		this.maDanhMuc = maDanhMuc;
		this.maTinh = maTinh;
		this.maQuanHuyen = maQuanHuyen;
		this.maPhuongXa = maPhuongXa;
		this.tenBaiDang = tenBaiDang;
		this.trangThai = trangThai;
		this.adminID = adminID;
		this.gia = gia;
		this.dienTich = dienTich;
		this.donVi = donVi;
		this.hinhAnh = hinhAnh;
		this.thoiGian = thoiGian;
		this.diaChi = diaChi;
	}
	
	/**
	 * @param maBaiDang
	 * @param maLoaiBaiDang
	 * @param maThanhVien
	 * @param maHuong
	 * @param maDanhMuc
	 * @param maTinh
	 * @param maQuanHuyen
	 * @param maPhuongXa
	 * @param tenBaiDang
	 * @param trangThai
	 * @param adminID
	 * @param gia
	 * @param dienTich
	 * @param donVi
	 * @param hinhAnh
	 * @param thoiGian
	 * @param diaChi
	 * @param tenLoaiBaiDang
	 */
	public BaiDang(String maBaiDang, String maLoaiBaiDang, String maThanhVien,
			String maHuong, String maDanhMuc, String maTinh,
			String maQuanHuyen, String maPhuongXa, String tenBaiDang,
			String trangThai, String adminID, String gia, String dienTich,
			String donVi, String hinhAnh, String thoiGian, String diaChi,
			String tenLoaiBaiDang) {
		super();
		this.maBaiDang = maBaiDang;
		this.maLoaiBaiDang = maLoaiBaiDang;
		this.maThanhVien = maThanhVien;
		this.maHuong = maHuong;
		this.maDanhMuc = maDanhMuc;
		this.maTinh = maTinh;
		this.maQuanHuyen = maQuanHuyen;
		this.maPhuongXa = maPhuongXa;
		this.tenBaiDang = tenBaiDang;
		this.trangThai = trangThai;
		this.adminID = adminID;
		this.gia = gia;
		this.dienTich = dienTich;
		this.donVi = donVi;
		this.hinhAnh = hinhAnh;
		this.thoiGian = thoiGian;
		this.diaChi = diaChi;
		this.tenLoaiBaiDang = tenLoaiBaiDang;
	}

	/**
	 * @return the tenLoaiBaiDang
	 */
	public String getTenLoaiBaiDang() {
		return tenLoaiBaiDang;
	}

	/**
	 * @param tenLoaiBaiDang the tenLoaiBaiDang to set
	 */
	public void setTenLoaiBaiDang(String tenLoaiBaiDang) {
		this.tenLoaiBaiDang = tenLoaiBaiDang;
	}

	/**
	 * @return the maBaiDang
	 */
	public String getMaBaiDang() {
		return maBaiDang;
	}

	/**
	 * @param maBaiDang the maBaiDang to set
	 */
	public void setMaBaiDang(String maBaiDang) {
		this.maBaiDang = maBaiDang;
	}

	/**
	 * @return the maLoaiBaiDang
	 */
	public String getMaLoaiBaiDang() {
		return maLoaiBaiDang;
	}

	/**
	 * @param maLoaiBaiDang the maLoaiBaiDang to set
	 */
	public void setMaLoaiBaiDang(String maLoaiBaiDang) {
		this.maLoaiBaiDang = maLoaiBaiDang;
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
	 * @return the tenBaiDang
	 */
	public String getTenBaiDang() {
		return tenBaiDang;
	}

	/**
	 * @param tenBaiDang the tenBaiDang to set
	 */
	public void setTenBaiDang(String tenBaiDang) {
		this.tenBaiDang = tenBaiDang;
	}

	/**
	 * @return the trangThai
	 */
	public String getTrangThai() {
		return trangThai;
	}

	/**
	 * @param trangThai the trangThai to set
	 */
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
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
	 * @return the gia
	 */
	public String getGia() {
		return gia;
	}

	/**
	 * @param gia the gia to set
	 */
	public void setGia(String gia) {
		this.gia = gia;
	}

	/**
	 * @return the dienTich
	 */
	public String getDienTich() {
		return dienTich;
	}

	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}

	/**
	 * @return the donVi
	 */
	public String getDonVi() {
		return donVi;
	}

	/**
	 * @param donVi the donVi to set
	 */
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	/**
	 * @return the hinhAnh
	 */
	public String getHinhAnh() {
		return hinhAnh;
	}

	/**
	 * @param hinhAnh the hinhAnh to set
	 */
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	/**
	 * @return the thoiGian
	 */
	public String getThoiGian() {
		return thoiGian;
	}

	/**
	 * @param thoiGian the thoiGian to set
	 */
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
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
	
	
}
