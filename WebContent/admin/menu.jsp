<%-- 
    Document   : menu
    Created on : Nov 28, 2017, 10:06:57 AM
    Author     : CỌP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>menu-admin</title>

</head>

<body>
	<%
		String tenDangNhap = null;
		if (session.getAttribute("tenDangNhap") != null) {
			tenDangNhap = (String) session.getAttribute("tenDangNhap");
		}
	%>

	<div id="leftBar">
		<ul>
			<li><a href="/QuanLyBatDongSan/TrangChuServlet">Trang chủ</a></li>
			<li><a href="#">Quản lý thông tin cá nhân</a>
				<ul class="sub-menu2">
					<li><a
						href="CapNhatThongTinAdminServlet?maIDAdminURL=<%=tenDangNhap%>">
							Cập nhật thông tin cá nhân</a></li>
					<li><a
						href="DoiMatKhauAdminServlet?maIDAdminURL=<%=tenDangNhap%>">Đổi
							mật khẩu</a></li>
				</ul></li>
			<li>
				<a href="/QuanLyBatDongSan/DanhSachThanhVienServlet">Quản
					lý thành viên</a>
			</li>
			<li>
				<a href="/QuanLyBatDongSan/DanhSachThanhVienServlet">Quản
					lý thông điệp</a>
			</li>
			<li><a href="/QuanLyBatDongSan/DanhSachTatCaBaiDangServlet">Quản
					lý bài đăng</a>
				<ul class="sub-menu2">
					<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="cpdd"%>">Chờ
							phê duyệt</a></li>
					<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="dr"%>">Đang
							rao</a></li>
					<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="ktr"%>">Kết
							thúc rao</a></li>
				</ul></li>
			<li><a href="manager_khachhang.jsp">Quản lý báo cáo thống kê</a></li>
			<li><a href="#">Khác</a></li>
		</ul>
	</div>
</body>
</html>
