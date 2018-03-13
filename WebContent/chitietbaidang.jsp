<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/sigup.css" />
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href='images/favicon.ico' type="image/x-icon" />
<title>Quản lý bài đăng thành viên</title>
</head>
<body>
	<%
		BaiDang baiDang = (BaiDang) request.getAttribute("baiDang");
	%>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>BẤT ĐỘNG SẢN</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
			<div id="chitetquanlybatdongsantrangchu"></div>
		</div>
		<h2>
			#<%=baiDang.getMaBaiDang()%>
			-
			<%=baiDang.getTenLoaiBaiDang()%></h2>
		<div id="quanlychitietbaidangtrangchu">
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
					<td class="buttonxetduyet"><a
						style="background: #614ba5; padding: 5px; color: white"
						href="CapNhatTrangThaiBaiDangAdminServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>">Chỉnh sửa bài đăng</a></td>

					<td class="buttonxetduyet"><a
						style="background: #f44336; padding: 5px;color: white"
						href="CapNhatTrangThaiBaiDangAdminServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>">Gỡ
							bỏ bài đăng này</a></td>
					

				</table>
			</div>
		</div>

	</div>





</body>
</html>