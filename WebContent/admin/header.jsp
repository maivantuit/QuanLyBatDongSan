<%-- 
    Document   : header
    Created on : Nov 28, 2017, 9:50:14 AM
    Author     : CỌP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="org.apache.catalina.Session"%><html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header-admin</title>
    </head>
    <body>
 		<%
 		String tenDangNhap = null;
 			if(session.getAttribute("tenDangNhap")!=null){
 				 tenDangNhap =(String)session.getAttribute("tenDangNhap");
 			}
 		%>   
        <div id="header">
            <div class="inHeader">
                <div class="mosAdmin">
                    Xin chào,
                    <%                    	
                    	if(tenDangNhap != null){                    		                    
                    %>
                     <%=tenDangNhap %>                    
                    <% }%>
                    
                    <br>
                    
                    <a href="">Quản trị website</a> | <a href="">Giúp đỡ</a> | <a href="DangXuatAdminServlet">Đăng xuất</a>
                </div>
                <div class="clear"></div>
            </div>
        </div>
         
    </body>
</html>
