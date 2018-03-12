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
<title>Đăng tin</title>
</head>
<body>
	<%
		ArrayList<LoaiBaiDang> danhSachLoaiBaiDang = (ArrayList<LoaiBaiDang>) request.getAttribute("danhSachLoaiBaiDang");
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
		<form action="DangTinTrangChuServlet" method="POST">
		<div id="dangtinbatdongsan">
			<h2>Đăng tin</h2>
			<table>
				<tr>
					<td>Mã loại bài đăng:</td>
					<td>
					<select name="maloaibaidang">
							<option>Chọn mã loại bài đăng</option>
							<%for(LoaiBaiDang loaiBaiDang : danhSachLoaiBaiDang){ %>
							<option value="<%=loaiBaiDang.getMaLoaiBaiDang() %>"><%=loaiBaiDang.getMaLoaiBaiDang() %> - <%=loaiBaiDang.getTenLoaiBaiDang() %></option>
							<%} %>
					</select></td>

				</tr>
				<tr>
				<%
				HttpSession sesstion = request.getSession();
				ThanhVien thanhVien=(ThanhVien)session.getAttribute("thanhVien");
				
				%>
					<td>Mã thành viên</td>
					<td>
						<input style="background: red;text-align: center;" readonly="readonly" type="text" name="mathanhvien" value="<%=thanhVien.getMaThanhVien() %>" />
						</td>
					
				</tr>
				<tr>
				<%
					ArrayList<Huong> danhSachHuong = (ArrayList<Huong>)request.getAttribute("danhSachHuong");
				%>
					<td>Mã hướng:</td>
					<td><select name="mahuong">
						<option>Chọn mã hướng</option>
						<%for(Huong huong: danhSachHuong){ %>
						<option value="<%=huong.getMaHuong() %>"><%=huong.getMaHuong() %> - <%=huong.getTenHuong() %></option>
						<%} %>
					</select></td>
				</tr>
				<tr>
				<%
				ArrayList<DanhMuc> danhSachDanhMuc = (ArrayList<DanhMuc>)request.getAttribute("danhSachDanhMuc");
				%>
					<td>Mã danh mục:</td>
					<td><select name="madanhmuc">
						<option>Chọn mã danh mục</option>
						<%
							for(DanhMuc danhMuc: danhSachDanhMuc){
						%>
						<option value="<%=danhMuc.getMaDanhMuc() %>"><%=danhMuc.getMaDanhMuc() %> - <%=danhMuc.getTenDanhMuc() %></option>
						<%} %>
					</select></td>
				</tr>
				<tr>
				<%
				
				ArrayList<Tinh> danhSachTinh = (ArrayList<Tinh>)request.getAttribute("danhSachTinh");
				%>
					<td>Mã tĩnh:</td>
					<td><select name="matinh">
						<option>Chọn mã tĩnh</option>
						<%
							for(Tinh tinh: danhSachTinh){															
						%>
						<option value="<%=tinh.getMaTinh()%>"><%=tinh.getMaTinh()%>-<%=tinh.getTenTinh()%></option>
						<%} %>
					</select></td>
				</tr>
				<tr>					
				<%
				
				ArrayList<QuanHuyen> danhSachQuanHuyen = (ArrayList<QuanHuyen>)request.getAttribute("danhSachQuanHuyen");
				%>
					<td>Mã quận huyện:</td>
					<td><select name="maquanhuyen">
						<option>Chọn mã quận huyện</option>
						<%for(QuanHuyen quanHuyen : danhSachQuanHuyen){ %>
						<option value="<%=quanHuyen.getMaQuanHuyen()%>"><%=quanHuyen.getMaQuanHuyen()%>-<%=quanHuyen.getTenQuanHuyen()%></option>
						<%} %>
					</select></td>
				</tr>
				<tr>
				<%
				
				ArrayList<PhuongXa> danhSachPhuongXa = (ArrayList<PhuongXa>)request.getAttribute("danhSachPhuongXa");
				%>
					<td>Mã phường xã:</td>
					<td><select name="maphuongxa">
						<option>Chọn mã phường xã</option>
						<%
							for(PhuongXa phuongXa: danhSachPhuongXa){
						%>
						<option value="<%=phuongXa.getMaPhuongXa()%>"><%=phuongXa.getMaPhuongXa()%>-<%=phuongXa.getTenPhuongXa()%></option>
						<%} %>
					</select></td>
				</tr>
				<tr>
					<td>Tên bài đăng:</td>
					<td><input type="text" name="tenbaidang" value="" /></td>
				</tr>
				<tr>
					<td>Mô tả:</td>
					<td>					
					<textarea rows="" cols="" type="text" name="mota" value=""></textarea>
					</td>
				</tr>
				<tr>
					<td>Diện tích:</td>
					<td><input type="text" name="dientich" value="" /></td>
				</tr>
				<tr>
					<td>Đơn vị:</td>
					<td><input type="text" name="donvi" value="" /></td>
				</tr>
				<tr>
					<td>Địa chỉ:</td>
					<td><input type="text" name="diachi" value="" /></td>
				</tr>
				<tr>
					<td>Giá:</td>
					<td><input type="text" name="gia" value="" /></td>
				</tr>
				<tr>
					<td>Hình ảnh:</td>
					<td>
						<input style="width: 350px" type="file" name="hinhanh" >
					</td>
					
				</tr>
				<%
					String success = (String) request.getAttribute("success");
					if(success!=null){
				%>
				<tr>
					<td></td>
					<td>
						<h5 style="color: blue"><%=success%></h5>
					</td>
				</tr>
				<%} %>
				<tr>
				<td></td>
					<td><button type="submit" name="submit"
									value="submit">Thêm tin</button></td>
				</tr>
				
			</table>
		</div>
		</form>
		<div id="foodterdangtin"></div>

	</div>

</body>
</html>