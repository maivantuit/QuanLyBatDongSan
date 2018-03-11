<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/top.css">
<script src="./js/jquery-1.11.2.min.js"></script>
<script src="./js/image.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<BaiDang> danhSachTongHopBaiDang = (ArrayList<BaiDang>) request.getAttribute("danhSachTongHopBaiDang");			
	%>
	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase">

			<h1 class="w3-xxxlarge w3-text-red">
				<b>BẤT ĐỘNG SẢN</b>
			</h1>
			<hr style="width: 355px; border: 5px solid red" class="w3-round">			
		</div>

		<div class="w3-row-padding">
			<div class="w3-half">
				<img src="images/baidang1.png" style="width: 100%"
					onclick="onClick(this)" alt="Concrete meets bricks"> <img
					src="images/baidang2.jpg" style="width: 100%"
					onclick="onClick(this)"
					alt="Light, white and tight scandinavian design"> <img
					src="images/baidang3.jpg" style="width: 100%"
					onclick="onClick(this)" alt="White walls with designer chairs">
			</div>

			<div class="w3-half">
				<img src="images/baidang4.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Windows for the atrium"> <img
					src="images/baidang5.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Bedroom and office in one space">
				<img src="images/baidang6.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Scandinavian design">
			</div>
		</div>

		<div id="modal01" class="w3-modal w3-black" style="padding-top: 0"
			onclick="this.style.display='none'">
			<span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
			<div
				class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
				<img id="img01" class="w3-image">
				<p id="caption"></p>
			</div>
		</div>
		<div id="foodtertop">
			<div id="content">
				<H2>BẤT ĐỘNG SẢN CẬP NHẬT MỚI NHẤT (<%=danhSachTongHopBaiDang.size()%>)</H2>
				<div id="content-left">
				
					<ul>
					<%
						for(BaiDang baiDang : danhSachTongHopBaiDang){												
					%>
						<li>
							<a href="ChiTietBaiDangTrangChuServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>"><img src="<%=baiDang.getHinhAnh()%>"></a>
							<p style="font-size:20px;color: red;font-weight:bold;" ><a href="ChiTietBaiDangTrangChuServlet?maBaiDangURL=<%=baiDang.getMaBaiDang()%>"><%=baiDang.getTenBaiDang()%></a></p>
							<p>Thời gian: <%=baiDang.getThoiGian() %></p>
							<p>Giá: <%=baiDang.getGia() %></p>
							<p>Diện tích: <%=baiDang.getDienTich() %><p>							
							<p>Mô tả: <%=baiDang.getMoTa()%></p>
						</li>
					<%
						}
					%>
						
					</ul>
				</div>
				<div id="content-right">
					<div class="menu_right">
						<h3>LIÊN KẾT NỔI BẬT</h3>
						<ul>
							<li><a href="">Bán đất trang trại Đà Lạt</a></li>
							<li><a href="">Bán nhà mặt phố Phú Vang</a></li>
							<li><a href="">Bán đất nền Dĩ An</a></li>
							<li><a href="">Bán nhà riêng Quận 9</a></li>
							<li><a href="">Bán căn hộ cao cấp Heaven </a></li>
							<li><a href="">Cho thuê văn phòng Đống Đa</a></li>
							<li><a href="">Cho thuê nhà riêng Đống Đa</a></li>
							<li><a href="">Bán đất nền khu dân cư VSIP 1</a></li>
							<li><a href="">Cho thuê nhà riêng Ba Đình</a></li>
							<li><a href="">Bán biệt thự liền kề Quảng Ngãi</a></li>
						</ul>
					</div>
					<div class="img-quangcao">
						<img src="images/bannerquangcao.jpg" />
					</div>
				</div>
			</div>
		</div>
		<div id="foodterend"></div>
</body>
</html>