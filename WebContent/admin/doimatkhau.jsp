<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đổi mật khẩu</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->

</head>
<body>

	
	<%
		Admin admin = (Admin)request.getAttribute("admin");
	%>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<h3>Đổi mật khẩu</h3>
			<form action="DoiMatKhauAdminServlet" method="POST">
			<div>
				<input style="color:red; background: violet; text-align: center" name="maAdmin" value="<%=admin.getAdminID()%>">
			</div>
			<table>
				
						
				<tr>
					<td>Mật khẩu cũ: </td>
					<td><input  value="" type="password" name="matkhaucu"></td>
				</tr>
				<tr>
					<td>Mật khẩu mới: </td>
					<td><input value="" type="password" name="matkhaumoi"></td>
				</tr>
				<tr>
					<td>Nhập lại mật khẩu mới: </td>
					<td><input value="" type="password" name="nhaplaimatkhaumoi"></td>
				</tr>
			</table>			
				
			<button style="margin-left: 190px;" type="submit" value="submit" name="submit">Đổi mật khẩu</button>
			</form>
		</div>
		<div class="clear"></div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
