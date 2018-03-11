<%-- 
    Document   : login
    Created on : Oct 26, 2017, 9:21:30 AM
    Author     : CỌP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="/QuanLyBatDongSan/css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->
        <link rel="icon" href='images/favicon.ico' type="image/x-icon" />
        <title>login</title>
        
    </head>
    <body>    
        <%-- Theo thứ tự --%>
        <div id="header">
            <div class="inHeader">                
            </div>
        </div>   
            <div class="account">
                <h2 class="account-in">Login</h2>
                <form action="DangNhapAdminServlet" method="post">
                    <% if(request.getParameter("error")!=null){%>
                    <div>
                        <p style="color:red"><%= request.getParameter("error") %></p>
                    </div> 
                    <%}%>
                    <div>
                        <span>Username</span>
                        <input type="text" name="tenDangNhap">
                    </div> 	                        
                    <div> 
                        <span class="word">Password*</span>
                        <input type="password" name="matKhau">
                    </div>
                   	<button class="btn btn-primary" type="submit" value="submit" name="submit">Đăng nhập</button>
					<button class="btn btn-primary" type="reset" value="submit" name="submit">Hủy</button> 
                </form>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
