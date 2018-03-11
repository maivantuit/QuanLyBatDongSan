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
<title>Chi tiết bất động sản</title>
</head>
<body>
	<%
		BaiDang baiDang = (BaiDang) request.getAttribute("baiDang");
		ThanhVien thanhVien = (ThanhVien) request.getAttribute("thanhVien");
	%>
	<jsp:include page="header.jsp"></jsp:include>


	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase">

			<h1 class="w3-xxxlarge w3-text-red">
				<b>BẤT ĐỘNG SẢN</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
		</div>



		<div id="chitietbatdongsan">
			<div id="topchitietbatdongsan">
				<div id="hinhanhchitietbatdongsan">
					<img alt="" src="<%=baiDang.getHinhAnh()%>" />
				</div>
				<div id="lienhechitietbatdongsan">
					<table>
						<tr>
							<h2 class="lienhe">LIÊN HỆ</h2>
						</tr>
						<tr>
							<h4 class="lienhe"><%=thanhVien.getTenThanhVien() %></h4>
						</tr>
						<tr>
							<h4 class="lienhe"><%=thanhVien.getEmail() %></h4>
						</tr>
						<tr>
							<button class="lienhe" type="" value=""><%=thanhVien.getSdt() %></button>
						</tr>
						<br />
						<tr>
							<div>
								<input class="lienhe" type="text" placeholder="Nhập tên của bạn" />
							</div>
						</tr>
						<tr>
							<div>
								<input class="lienhe" type="text"
									placeholder="Nhập gmail của bạn" />
							</div>
						</tr>
						<tr>
							<div>
								<input class="lienhe" type="text" placeholder="Nhập sđt của bạn" />
							</div>
						</tr>
						<tr>
							<button class="lienhe" type="submit" value="GỬI THÔNG ĐIỆP">GỬI
								THÔNG ĐIỆP</button>
						</tr>

					</table>



				</div>
			</div>
		</div>

		<div id="chitietbatdongsan2">
			<div id="tenvamotachitietdongsan">
				<h2>
					<%=baiDang.getTenBaiDang()%></h2>
				<p>
					
					<%=baiDang.getMoTa()%></p>
			</div>
			<div id="infochitietdongsan">
				<table>
					<tr>
						<td>Mã bài đăng:</td>
						<td><%=baiDang.getMaBaiDang()%></td>
					</tr>
					<tr>
						<td>Loại bất động sản:</td>
						<td><%=baiDang.getMaLoaiBaiDang()%></td>
					</tr>
					<tr>
						<td>Địa chỉ:</td>
						<td><%=baiDang.getDiaChi()%></td>
					</tr>
					<tr>
						<td>Giá cả:</td>
						<td><%=baiDang.getGia()%></td>
					</tr>
					<tr>
						<td>Diện tích:</td>
						<td><%=baiDang.getDienTich()%></td>
					</tr>
					<tr>
						<td>Ngày đăng tin:</td>
						<td><%=baiDang.getThoiGian()%></td>
					</tr>
				</table>
			</div>
		</div>
		<div id="foodterchitiet"></div>
	</div>

</body>
</html>