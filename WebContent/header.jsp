<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="css/menu.css">
<script src="./js/jquery-1.11.2.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding"
		style="z-index:3;width:300px;font-weight:bold;" id="mySidebar">
	<br>
	<a class="w3-button w3-hide-large w3-display-topleft"
		style="width: 100%; font-size: 22px">Close Menu</a>
	<div class="w3-container">
	<h4><a href="trangchu.jsp">Trang chủ</a></h4>
		<h4><a href="dangnhap.jsp">Đăng nhập</a></h4>
		
		<h4><a href="dangkythanhvien.jsp" >Đăng ký thành viên</a></h4>
		<h3 class="w3-padding-64">
			<b>-----------------------------
			</b>
		</h3>
	</div>
	<div class="w3-bar-block">
		<div id="menu" class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				data-toggle="dropdown" style="width: 156px;">
				Cần Mua <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="dropdown-header">Cần Mua</li>
				<li><a href="#">Mua Đất</a></li>
				<li><a href="#">Mua Nhà Riêng</a></li>
				<li><a href="#">Mua Căn Hộ Chung Cư</a></li>

			</ul>
		</div>
		<div id="menu" class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				data-toggle="dropdown">
				Nhà Đất Cho Thuê <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="dropdown-header">Nhà Đất Cho Thuê</li>
				<li><a href="#">Cho Thuê Căn Hộ Chung Cư</a></li>
				<li><a href="#">Cho Thuê Văn Phòng</a></li>
				
			</ul>
		</div>
	</div>
	<div id="menu" class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				data-toggle="dropdown" style="width: 156px;">
				Nhà Đất Bán <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="dropdown-header">Bán Căn Hộ Chung Cư</li>
				<li><a href="#">Bán Nhà Riêng</a></li>
				<li><a href="#">Bán Đất</a></li>
				<li><a href="#">Bán Căn Hộ Chung Cư</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>