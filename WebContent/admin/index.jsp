<%-- 
    Document   : index
    Created on : Nov 28, 2017, 9:50:46 AM
    Author     : CỌP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trang chủ quản trị viên</title>
<link rel="icon" href='images/favicon.ico' type="image/x-icon" />
<link href="/QuanLyBatDongSan/css/mos-style.css" rel='stylesheet'
	type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->

</head>
<body>


<jsp:include page="header.jsp"></jsp:include>

<div id="wrapper"><jsp:include page="menu.jsp"></jsp:include> <jsp:include
	page="content.jsp"></jsp:include> <jsp:include page="footer.jsp"></jsp:include>
</div>
<%
 		String tenDangNhap = null;
 			if(session.getAttribute("tenDangNhap")!=null){
 				 tenDangNhap =(String)session.getAttribute("tenDangNhap");
 			}
 		%>  
 		 <%                    	
                    	if(tenDangNhap != null){                    		                    
                    %>                    
                      <script type="text/javascript">
						alert("Xin chào: <%= tenDangNhap %>");
					</script>
                    <% }%>
</body>
</html>
