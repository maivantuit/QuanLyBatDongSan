<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý chi tiết bài đăng</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->

</head>
<body>

	<%
		BaiDang baiDang = (BaiDang) request.getAttribute("baiDang");
		ThanhVien thanhVien = (ThanhVien) request.getAttribute("thanhVien");
	%>

	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper"><jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<h1>Quản lý chi tiết bài đăng</h1>

			<h2>
				#<%=baiDang.getMaBaiDang()%>
				-
				<%=baiDang.getTenLoaiBaiDang()%></h2>


			<div id="quanlychitietthanhvien">
				<div id="anhdaidien">
					<img alt="" src="<%=baiDang.getHinhAnh()%>">
				</div>
				<div id="info">
					<table>
						<tr>
							<td>Ngày đăng: <%=baiDang.getThoiGian()%></td>
						</tr>

						<tr>
							<td>Địa chỉ: <%=baiDang.getDiaChi()%></td>
						</tr>
						<tr>
							<td>Diện tích: <%=baiDang.getDienTich()%></td>
						</tr>
						<tr>
							<td>Giá: <%=baiDang.getGia()%></td>
						</tr>

						<tr>
							<%
								if (baiDang.getTrangThai().equals("Chờ phê duyệt")) {
							%>
							<td class="buttonxetduyet"><a
								href="CapNhatTrangThaiBaiDangAdminServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>">Duyệt
									bài đăng này</a></td>
							<%
								}
							%>
						
						<tr>
							<%
								if (baiDang.getTrangThai().equals("Đang rao")) {
							%>
							<td class="buttonxetduyet"><a
								href="CapNhatTrangThaiGoBaiDangAdminServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>">Gỡ
									bài đăng này </a></td>
							<%
								}
							%>
							<%
								// lay tu du lieu:
								if (baiDang.getTrangThai().equals("Kết thúc rao")) {
							%>
							<td class="buttonxetduyet"><a href="#">Gỡ bài đăng này</a>
							</td>
							<%
								}
							%>
						</tr>
					</table>
				</div>
			</div>
			<div id="thongtinlienhe">
				<h3>Thông tin liên hệ</h3>
				<table>
					<tr>
						<td>Họ và tên:</td>
						<td><%=thanhVien.getTenThanhVien()%></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><%=thanhVien.getEmail()%></td>
					</tr>
					<tr>
						<td>Số điện thoại:</td>
						<td><%=thanhVien.getSdt()%></td>
					</tr>
					<tr>
						<td>Địa chỉ:</td>
						<td><%=thanhVien.getDiaChi()%></td>
					</tr>
				</table>

			</div>

		</div>
		<div class="clear"></div>
		<jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>
