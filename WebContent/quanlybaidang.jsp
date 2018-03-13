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
		ArrayList<BaiDang> danhSachBaiDang = (ArrayList<BaiDang>)request.getAttribute("danhSachBaiDang");
	%>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>BẤT ĐỘNG SẢN</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
			<div id="quanlybatdongsantrangchu">
				<table>

					<tr class="data">
						<th class="data" width="30px">STT</th>
						<th class="data">Mã bài đăng</th>
						<th class="data">Tên bài đăng</th>
						<th class="data">Trạng thái</th>
						<th class="data" width="120px">Chức năng</th>
					</tr>
					<%
						int dem=0;
									for(BaiDang baiDang : danhSachBaiDang){
										dem++;
					%>
					<tr>
						<td><%=dem%></td>
						<td><%=baiDang.getMaBaiDang()%></td>
						<td><%=baiDang.getTenBaiDang()%></td>
						<td><%=baiDang.getTrangThai()%></td>
						<td>
							<center>
								<a style="color: blue"
									href="ChiTietBaiDangThanhVienServlet?maBaiDangUrl=<%=baiDang.getMaBaiDang()%>">Xem
									chi tiết</a>&nbsp;&nbsp; &nbsp;&nbsp;

							</center>
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>


	</div>





</body>
</html>