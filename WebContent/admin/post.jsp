<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý bài đăng chờ phê duyệt</title>        
     	<link href="css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->	

    </head>
    <body>      

		<%
			ArrayList<BaiDang> danhSachBaiDangTrangThai = (ArrayList<BaiDang>)request.getAttribute("listBaiDangTrangThai");
		%>
		
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý bài đăng</h3>       
                    <a href="insert_danhmuc.jsp">Tìm kiếm</a>
                    <input type="text" placeholder="Search..">
                 
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã bài đăng</th>
                            <th class="data">Tên bài đăng</th>
                            <th class="data">Trạng thái</th>                                                                                 
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                    	int dem=0;
                    	for(BaiDang baiDang : danhSachBaiDangTrangThai){
                    	dem++;
                    %>                                                                        
                    <tr class="data">
                        <td class="data" width="30px"><%=dem %></td>
                        <td class="data"><%= baiDang.getMaBaiDang() %></td>
                        <td class="data"><%= baiDang.getTenBaiDang() %></td>
                        <td class="data"><%= baiDang.getTrangThai() %></td>                                                                         
                        <td class="data" width="90px">
		                    <center>		                        		                       
		                        <a href="ChiTietBaiDangServlet?maBaiDangUrl=<%=baiDang.getMaBaiDang()%>">Xem chi tiết | Gỡ bỏ</a>&nbsp;&nbsp; &nbsp;&nbsp;                        
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
