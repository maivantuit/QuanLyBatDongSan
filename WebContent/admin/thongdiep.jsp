<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý thông điệp</title>        
     	<link href="css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->	

    </head>
    <body>      

		<%
			ArrayList<ThongDiep> danhSachThongDiep = (ArrayList<ThongDiep>)request.getAttribute("danhSachThongDiep");
		%>
		
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý thông điệp</h3>       
                    <a href="insert_danhmuc.jsp">Tìm kiếm</a>
                    <input type="text" placeholder="Search..">
                 
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã thông điệp</th>
                            <th class="data">Mã bài đăng</th>
                            <th class="data">Tên người gửi</th>
                            <th class="data">Gmail người gửi</th>
                            <th class="data">Số điện thoại người gửi</th>                                                                                 
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                    	int dem=0;
                    	for(ThongDiep thongDiep : danhSachThongDiep){
                    	dem++;
                    %>                                                                        
                    <tr class="data">
                        <td class="data" width="30px"><%=dem %></td>
                        <td class="data"><%= thongDiep.getMaThongDiep() %></td>
                        <td class="data"><%= thongDiep.getMaBaiDang() %></td>
                        <td class="data"><%= thongDiep.getTenNguoiGui() %></td>
                        <td class="data"><%= thongDiep.getGmailNguoiGui() %></td>
                        <td class="data"><%= thongDiep.getSdtNguoiGui() %></td>                                                                         
                        <td class="data" width="90px">
		                    <center>		                        		                       
		                        <a href="ChiTietBaiDangServlet?maBaiDangUrl=<%=thongDiep.getMaBaiDang()%>">Xem chi tiết</a>&nbsp;&nbsp; &nbsp;&nbsp;
		                                           
		                    </center>
	                    </td>
                    </tr>    
                  
                    <% }%>                  
                </table>
            </div>
            <div class="clear"></div> 
            <jsp:include page="footer.jsp"></jsp:include> 
        </div>
    </body>
</html>
