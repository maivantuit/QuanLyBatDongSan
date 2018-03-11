<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- w3 css -->
<link rel="stylesheet" href="css/menu.css">
<script src="./js/jquery-1.11.2.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpSession sesstion = request.getSession();
		ThanhVien thanhVien = (ThanhVien)sesstion.getAttribute("thanhVien");
	%>
	<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding"
		style="z-index:3;width:300px;font-weight:bold;" id="mySidebar">
	<br>
	<a class="w3-button w3-hide-large w3-display-topleft"
		style="width: 100%; font-size: 22px">Close Menu</a>
	<div class="w3-container">
		<h4>
			<a href="TrangChuBatDongSanServlet">Trang chủ</a>
		</h4>
		<%if(thanhVien!=null){ %>
		<h4 style="color: blue; font-weight: bold;">
			<a href="">Xin chào: <%=thanhVien.getTenThanhVien() %></a>
		</h4>
		<h4>
			<a href="">Thông tin cá nhân</a>
		</h4>
		<h4>
			<a href="">Quản lý bài đăng</a>
		</h4>
		<h4>
			<a href="DangXuatTrangChuServlet">Đăng xuất</a>
		</h4>
		<%} else{%>
		<h4>
			<a href="DangNhapTrangChuServlet">Đăng nhập</a>
		</h4>
		<h4>
			<a href="dangkythanhvien.jsp">Đăng ký thành viên</a>
		</h4>
		<h4>
			<a href="DangNhapTrangChuServlet">Đăng tin</a>
		</h4>
		<%} %>
	</div>
	<div class="w3-bar-block">
		<div id="menu" class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				data-toggle="dropdown" style="width: 250px;">
				Nhà đất cần mua <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="dropdown-header">Nhà đất cần mua</li>
				<li><a href="#">Mua Đất</a></li>
				<li><a href="#">Mua Nhà Riêng</a></li>
				<li><a href="#">Mua Căn Hộ Chung Cư</a></li>

			</ul>
		</div>
		<div id="menu" class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				data-toggle="dropdown" style="width: 250px;">
				Nhà đất cần bán <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="dropdown-header">Nhà đất cần bán</li>
				<li><a href="#">Bán Căn Hộ Chung Cư</a></li>
				<li><a href="#">Bán Văn Phòng</a></li>

			</ul>
		</div>
	</div>
	<div id="menu" class="dropdown">
		<button class="btn btn-default dropdown-toggle" type="button"
			data-toggle="dropdown" style="width: 250px;">
			Nhà đất cho thuê <span class="caret"></span>
		</button>
		<ul class="dropdown-menu">
			<li class="dropdown-header">Thuê Căn Hộ Chung Cư</li>
			<li><a href="#">Thuê Nhà Riêng</a></li>
			<li><a href="#">Thuê Đất</a></li>
			<li><a href="#">Thuê Căn Hộ Chung Cư</a></li>
		</ul>
	</div>
	<div id="menu" class="dropdown">
		<button class="btn btn-default dropdown-toggle" type="button"
			data-toggle="dropdown" style="width: 250px;">
			Nhà đất cần thuê <span class="caret"></span>
		</button>
		<ul class="dropdown-menu">
			<li class="dropdown-header">Cần Thuê Căn Hộ Chung Cư</li>
			<li><a href="#">Cần Thuê Nhà Riêng</a></li>
			<li><a href="#">Cần Thuê Đất</a></li>
			<li><a href="#">Cần Thuê Căn Hộ Chung Cư</a></li>
		</ul>
	</div>
	<div id="timkiem">
		<input class="timkiemall" type="text" name=""
			placeholder="Tìm kiếm..." />
		<table>
			<tr>
				<td><select>
						<option class="timkiemall">Loại bất động sản</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Tĩnh/thành phố</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Quận/huyện</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Phường/xã</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Đường/phố</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Diện tích</option>
						<option class="timkiemall">A</option>
						<option class="timkiemall">B</option>
				</select></td>
			</tr>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Mức giá</option>
				</select></td>
			</tr>
			</tr>
			<tr>
				<td>
					<button id="xemketqua">Xem kết quả</button>
				</td>
			</tr>
		</table>
	</div>
	</nav>
</body>
</html>