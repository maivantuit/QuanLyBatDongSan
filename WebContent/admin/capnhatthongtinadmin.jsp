<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cập nhật thông tin cá nhân</title>
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
			<h3>Cập nhật thông tin cá nhân</h3>
			<form action="CapNhatThongTinAdminServlet" method="POST">
			ID admin: 
				<input readonly="readonly" value="<%=admin.getAdminID()%>" type="text" name="idadmin">
			Tên admin: 
				<input value="<%=admin.getAdminName() %>" type="text" name="adminName">
			<!--nho bo text, bo date no loi-->
			Cấp độ: 
				<select name="capDo">
					<option value="<%=admin.getCapDo()%>">Cấp độ: <%=admin.getCapDo()%></option>				
					<option value="1"><%=1%>
					<option value="2"><%=2%>
					<option value="3"><%=3%>										
				</select>
			<button type="submit" value="submit" name="submit">Cập nhật</button>
			</form>
		</div>
		<div class="clear"></div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
