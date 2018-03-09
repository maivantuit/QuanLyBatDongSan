create database QuanLyBatDongSan
go
use QuanLyBatDongSan
go
create table Admins(
	AdminID varchar(15) primary key,
	Password varchar(40),	
	AdminName nvarchar(40),
	CapDo varchar(30)	-- 1, 2,3
)
insert into Admins(AdminID,Password,AdminName,CapDo) values ('adminmain','123','Adminitrator','1')
insert into Admins(AdminID,Password,AdminName,CapDo) values ('adminsub1','123','AdminitratorSub1','2')


create table TruyCap(
	ThoiGianTruyCap time primary key,
	SoLuotTruyCap int,
)
create table LoaiBaiDang(
	MaLoaiBaiDang varchar(15) primary key,
	TenLoaiBaiDang nvarchar(40)
)
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD01',N'Cần bán')
create table DanhMuc(
	MaDanhMuc varchar(15) primary key,
	TenDanhMuc nvarchar(30),
)
insert into DanhMuc(MaDanhMuc,TenDanhMuc)
values('DM01',N'Bán đất')
create table Huong(
	MaHuong varchar(15) primary key,
	TenHuong nvarchar(40)
)
insert into Huong(MaHuong,TenHuong) 
values('H01',N'Tây Bắc')
create table ThanhVien(
	MaThanhVien varchar(15),
	TenThanhVien nvarchar(40),
	Email varchar(50),
	MatKhau varchar(40),
	DiaChi nvarchar(100),
	SoDienThoai varchar(30),
	AnhDaiDien varchar(100),
	primary key(MaThanhVien)
)
insert into ThanhVien(MaThanhVien,TenThanhVien,Email,MatKhau,DiaChi,SoDienThoai,AnhDaiDien) 
values ('TV001',N'Mai Văn Tú','maivantu@gmail.com','123',N'Quảng Trị','0977775487','images/tu.png');\
insert into ThanhVien(MaThanhVien,TenThanhVien,Email,MatKhau,DiaChi,SoDienThoai,AnhDaiDien) 
values ('TV002',N'Từ Thanh Thành','tuthanhthanh@gmail.com','123',N'Quảng Trị','0977775487','images/tu.png');
insert into ThanhVien(MaThanhVien,TenThanhVien,Email,MatKhau,DiaChi,SoDienThoai,AnhDaiDien) 
values ('TV003',N'Phan Châu Anh','phanchauanh@gmail.com','123',N'Quảng Trị','0977775487','images/tu.png');
insert into ThanhVien(MaThanhVien,TenThanhVien,Email,MatKhau,DiaChi,SoDienThoai,AnhDaiDien) 
values ('TV004',N'Lê Thị Dương','lethiduong@gmail.com','123',N'Quảng Trị','0977775487','images/tu.png');

create table Tinh(
	MaTinh varchar(15) primary key,
	TenTinh nvarchar(50)
)
insert into Tinh(MaTinh,TenTinh)
values('T01',N'Hà Nội')
create table QuanHuyen(
	MaQuanHuyen varchar(15) primary key,
	TenQuanHuyen nvarchar(50),
	MaTinh varchar(15) foreign key references Tinh(MaTinh)
)
insert into QuanHuyen(MaQuanHuyen,TenQuanHuyen,MaTinh)
values('Q01',N'Long Biên','T01')
create table PhuongXa(
	MaPhuongXa varchar(15) primary key,
	TenPhuongXa nvarchar(50),
	MaQuanHuyen varchar(15) foreign key references QuanHuyen(MaQuanHuyen)
)

insert into PhuongXa(MaPhuongXa,TenPhuongXa,MaQuanHuyen)
values('PX01',N'Long Đàn','Q01')
create table BaiDang(
	MaBaiDang int identity(1,1) primary key,	
	MaLoaiBaiDang varchar(15) foreign key references LoaiBaiDang(MaLoaiBaiDang),
	MaThanhVien varchar(15) foreign key references ThanhVien(MaThanhVien),	
	MaHuong varchar(15) foreign key references Huong(MaHuong),	
	MaDanhMuc varchar(15) foreign key references DanhMuc(MaDanhMuc),
	MaTinh varchar(15) foreign key references Tinh(MaTinh),
	MaQuanHuyen varchar(15) foreign key references QuanHuyen(MaQuanHuyen),
	MaPhuongXa varchar(15) foreign key references PhuongXa(MaPhuongXa),	
	TenBaiDang nvarchar(100),	
	TrangThai nvarchar(30)	
)
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền',N'Đang rao')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền 2',N'Đang rao')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền biển',N'Kết thúc rao')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền biển',N'Kết thúc rao')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Vinhouse',N'Đang rao')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền biển',N'Chờ phê duyệt')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán lô đất mặt tiền biển',N'Chờ phê duyệt')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán khu resot 1472',N'Chờ phê duyệt')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Bán khu resot 1472',N'Chờ phê duyệt')
select * from BaiDang




create table ChiTietBaiDang(
	MaBaiDang int foreign key references BaiDang(MaBaiDang),
	AdminID varchar(15) foreign key references Admins(AdminID),
	Gia decimal(18,0),
	DienTich nvarchar(30),
	DonVi varchar(40),
	SoLuotXem int,
	HinhAnh varchar(100),
	ThoiGianDang time,
	NoiDung nvarchar(500),
	DiaChi nvarchar(50),
)
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('1','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('1','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('1','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('2','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('3','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('5','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('4','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('6','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('7','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('8','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('9','2900000000','150m2','images/resort1.jpg',GETDATE(),'ABC',N'15 Hải Phòng')


create table BinhLuan(
	MaBinhLuan varchar(15) primary key,
	MaThanhVien varchar(15) foreign key references ThanhVien(MaThanhVien),
	MaBaiDang int foreign key references BaiDang(MaBaiDang),
	NoiDung nvarchar(100),
	ThoiGian time
)
--


select * from ChiTietBaiDang  join BaiDang on BaiDang.MaBaiDang = ChiTietBaiDang.MaBaiDang join LoaiBaiDang on LoaiBaiDang.MaLoaiBaiDang = BaiDang.MaLoaiBaiDang where BaiDang.MaBaiDang = '2'