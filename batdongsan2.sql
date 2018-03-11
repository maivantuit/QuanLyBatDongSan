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
insert into Admins(AdminID,Password,AdminName,CapDo) values ('admin','123','Adminitrator','1')
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
values('LBD01',N'Căn hộ chung cư')
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD02',N'Các loại nhà bán')
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD03',N'Các loại đất bán')
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD04',N'Trang trại, khu nghĩ dưỡng')
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD05',N'Kho nhà xưởng')
insert into LoaiBaiDang (MaLoaiBaiDang,TenLoaiBaiDang)
values('LBD06',N'Bất động sản khác')
create table DanhMuc(
	MaDanhMuc varchar(15) primary key,
	TenDanhMuc nvarchar(30),
)
insert into DanhMuc(MaDanhMuc,TenDanhMuc)
values('DM01',N'Nhà đất cần bán')
insert into DanhMuc(MaDanhMuc,TenDanhMuc)
values('DM02',N'Nhà đất cần mua')
insert into DanhMuc(MaDanhMuc,TenDanhMuc)
values('DM03',N'Nhà đất cho thuê')
insert into DanhMuc(MaDanhMuc,TenDanhMuc)
values('DM04',N'Nhà đất cần thuê')
create table Huong(
	MaHuong varchar(15) primary key,
	TenHuong nvarchar(40)
)
insert into Huong(MaHuong,TenHuong) 
values('H01',N'Tây Bắc')
insert into Huong(MaHuong,TenHuong) 
values('H02',N'Đông Bắc')
insert into Huong(MaHuong,TenHuong) 
values('H03',N'Tây Nam')
insert into Huong(MaHuong,TenHuong) 
values('H04',N'Bắc Nam')
insert into Huong(MaHuong,TenHuong) 
values('H05',N'Đông Nam')

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
values ('TV001',N'Mai Văn Tú','maivantu@gmail.com','123',N'Quảng Trị','0977775487','images/tu.png');
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
insert into Tinh(MaTinh,TenTinh)
values('T02',N'Đà Nẵng')
insert into Tinh(MaTinh,TenTinh)
values('T03',N'Nha Trang')
insert into Tinh(MaTinh,TenTinh)
values('T04',N'TP Hồ Chí Minh')
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
	TrangThai nvarchar(30),
	MoTa nvarchar(300)	
)
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Cần bán gấp 3 căn : flc 265 cầu giấy và flc garden đại mỗ, liền kề ls20,21',N'Đang rao',N'Cơ sở này bao gồm: * 5 căn hộ thiết kế Studio Thụy Sĩ, * 1 nhà hàng design Pizzeria Grotto * 1 sân Minigolf quốc tế trong khuôn viên thoai......')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Cần bán chcccc 1201 toà l3 khu đô thị ciputra-tây hồ hà nội',N'Đang rao',N'Căn hộ 816 là căn hộ khách sạn condotel nằm trong tòa khách sạn 21 tầng hướng view ra toàn bộ vịnh hạ long, xung quanh là quần thể biệt thự và...')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Gấp cần bán căn hộ 2 pn everrich infinity liền kề q1, full nội thất cao cấp',N'Kết thúc rao',N'Đất bán tại Lâm Đồng, 17.000 m2 PRICE: US $360K ( VND 480 triệu/1000 m2 ) ADDRESS: “PINE CREST FARMSTEAD” 19 Đường Đất Đỏ,...')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Felisa riverside quận 8, 99 bến bình đông, căn hộ an cư hot',N'Kết thúc rao',N'Vị trí căn hộ nằm ngay ngã tư an dương vương và võ văn kiệt, chỉ cách quận 1 15 phút chạy xe, dễ dàng di chuyển đến các quận trung tâm, không lo...')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Căn hộ tại iris garden ck2% cho 50kh đầu tiên',N'Đang rao',N'Cho thuê căn hộ, diện tích 40 m2, bao gồm 1 phòng khách, 1 phòng bếp, nhà vệ sinh. Căn hộ đầy đủ các tiện ich')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD04','TV001','H01','DM01','T01','Q01','PX01',N'Cơ hội đầu tư lớn từ dự án biển phú quốc của tập đoàn sungroup',N'Chờ phê duyệt',N'Giữ chỗ ngay hôm nay chỉ với 50 triệu để được sở hữu những căn đẹp nhất Monarchy trước ngày mở bán đợt cuối 1-4 tại Hà Nội và Đà Nẵng')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD04','TV001','H01','DM01','T01','Q01','PX01',N'Duy nhất 20 căn biệt thự mặt biển nha trang cam kết lợi nhuận hơn 2 tỷ/năm',N'Chờ phê duyệt',N'Căn 1201 ( S: 115,3m2) tòa nhà L03, khu đô thị Ciputra, thời gian nhận nhà quý I 2018 Giá bán: 4,8 tỷ ( có thỏa thuận nếu nhiệt tình mua)')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Căn hộ mặt tiền - view bitexco giá chỉ 1 tỷ 2 - liên hệ ngay để chọn căn đẹp',N'Chờ phê duyệt',N'Vị trí căn hộ nằm ngay giao lộ an dương vương với võ văn kiệt. cách trung tâm thành phố 15 phút chạy xe. thiết kế thông minh hình chữ u đón ánh...')
insert into BaiDang(MaLoaiBaiDang,MaThanhVien,MaHuong,MaDanhMuc,MaTinh,MaQuanHuyen,MaPhuongXa,TenBaiDang,TrangThai,MoTa)
values('LBD01','TV001','H01','DM01','T01','Q01','PX01',N'Chiết khấu lên đến 432 triệu khi mua căn hộ hinode city 201 minh khai',N'Chờ phê duyệt',N'Bán căn hộ cao cấp EverRich Infinity view Bitexco giá cực rẻ so với thị trường. - Diện tích 81m2. - 2 phòng ngủ, 2 Toilet, ban công, sân phơi,...')
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
values('1','2900000000','150m2','images/baidang1.png',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('2','2900000000','150m2','images/baidang2.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('3','2900000000','150m2','images/baidang3.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('5','2900000000','150m2','images/baidang4.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('4','2900000000','150m2','images/baidang5.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('6','2900000000','150m2','images/baidang6.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('7','2900000000','150m2','images/baidang7.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('8','2900000000','150m2','images/baidang8.jpg',GETDATE(),'ABC',N'15 Hải Phòng')
insert into ChiTietBaiDang(MaBaiDang,Gia,DienTich,HinhAnh,ThoiGianDang,NoiDung,DiaChi)
values('9','2900000000','150m2','images/baidang9.jpg',GETDATE(),'ABC',N'15 Hải Phòng')

select * from ThongDiep
create table ThongDiep(
	MaThongDiep int identity(1,1) primary key,
	MaBaiDang int foreign key references BaiDang(MaBaiDang),
	TenNguoiGui nvarchar(50),
	GmailNguoiGui varchar(50),
	SDTNguoiGui varchar(30)
)
insert into ThongDiep 
values('1',N'Phan Chân Anh','chauanh@gmail.com','0977237272')
create table BinhLuan(
	MaBinhLuan varchar(15) primary key,
	MaThanhVien varchar(15) foreign key references ThanhVien(MaThanhVien),
	MaBaiDang int foreign key references BaiDang(MaBaiDang),
	NoiDung nvarchar(100),
	ThoiGian time
)


----
select * from BaiDang
join ThanhVien on BaiDang.MaThanhVien = ThanhVien.MaThanhVien
where BaiDang.MaBaiDang = '1'