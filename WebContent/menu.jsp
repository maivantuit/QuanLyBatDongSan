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
			<a href="QuanLyBaiDangTrangChuServlet?maThanhVien=<%= thanhVien.getMaThanhVien()%>">Quản lý bài đăng</a>
		</h4>
		<h4>
			<a href="DangTinTrangChuServlet">Đăng tin</a>
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
			<form action="TrangChuBatDongSanServlet" method="GET">
		<table>
			<tr>
				<%
				ArrayList<LoaiBaiDang> danhSachLoaiBaiDang = (ArrayList<LoaiBaiDang>)request.getAttribute("danhSachLoaiBaiDang"); 
				%>
				<td><select name="maloaibatdongsan">
						<option value="" class="timkiemall">Loại bất động sản</option>
						<%
							if(danhSachLoaiBaiDang!=null){															
						%>
							<%
								for(LoaiBaiDang loaiBaiDang : danhSachLoaiBaiDang){
									
								
							%>
							<option value="<%=loaiBaiDang.getMaLoaiBaiDang() %>" class="timkiemall"><%=loaiBaiDang.getTenLoaiBaiDang() %></option>
							<%} %>
						<%} %>
				</select></td>
			</tr>
			<tr>
				<%
					ArrayList<Tinh> danhSachTinh = (ArrayList<Tinh>)request.getAttribute("danhSachTinh");
				%>
				<td><select name="matinh">
						<option class="timkiemall" value="">Tĩnh/thành phố</option>
						<%
							if(danhSachTinh!=null){															
						%>
							<%
								for(Tinh tinh : danhSachTinh){									
								
							%>
							<option value="<%=tinh.getMaTinh()%>" class="timkiemall"><%=tinh.getTenTinh()%></option>
							<%} %>
						<%} %>
				</select></td>
			</tr>
			<tr>
				<%
					ArrayList<QuanHuyen> danhSachQuanHuyen = (ArrayList<QuanHuyen>)request.getAttribute("danhSachQuanHuyen");
				%>
				<td><select  name="quanhuyen">
						<option value="" class="timkiemall">Quận/huyện</option>
						<%
							if(danhSachQuanHuyen!=null){															
						%>
							<%
								for(QuanHuyen quanHuyen : danhSachQuanHuyen){									
								
							%>
							<option value="<%=quanHuyen.getMaQuanHuyen() %>" class="timkiemall"><%=quanHuyen.getTenQuanHuyen() %></option>
							<%} %>
						<%} %>
				</select></td>
			</tr>			
			<tr>
				<td><select>
						<option class="timkiemall">Diện tích</option>
						<option class="timkiemall">10-100</option>
						<option class="timkiemall">100-1000</option>
						<option class="timkiemall">1000-10000</option>
				</select></td>
			</tr>
			</tr>
			<tr>
				<td><select>
						<option class="timkiemall">Mức giá</option>
						<option class="timkiemall">10-100</option>
						<option class="timkiemall">100-1000</option>
						<option class="timkiemall">1000-10000</option>
				</select></td>
			</tr>
			</tr>
			<tr>
				<td>
					<button id="xemketqua" type="submit" name="submit"
									value="submit">Xem kết quả</button>
				</td>
			</tr>
		</table>
		</form>
	</div>
	</nav>
</body>
</html>