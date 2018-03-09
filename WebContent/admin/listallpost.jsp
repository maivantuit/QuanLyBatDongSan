<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách tất cả bài đăng</title>        
     	<link href="css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->	

    </head>
    <body>      

		<%
			ArrayList<BaiDang> danhSachTatCaBaiDang = (ArrayList<BaiDang>)request.getAttribute("danhSachTatCaBaiDang");
		%>
		
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Danh sách tất cả bài đăng</h3>       
                    <a href="insert_danhmuc.jsp">Tìm kiếm</a>
                    <input type="text" placeholder="Search..">
                    <form action="DanhSachThanhVienServlet" method="POST">
                    </form>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã bài đăng</th>                            
                            <th class="data">Mã thành viên</th>
                            <th class="data">Mã hướng</th>
                            <th class="data">Mã danh mục</th>
                            <th class="data">Mã tĩnh</th>
                            <th class="data">Tên bài đăng</th>
                            <th class="data">Trạng thái</th>                                                                                 
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                    	int dem=0;
                    	for(BaiDang baiDang : danhSachTatCaBaiDang){
                    	dem++;
                    %>                                                                        
                    <tr class="data">
                        <td class="data" width="30px"><%=dem %></td>
                        <td class="data"><%= baiDang.getMaBaiDang() %></td>
                        <td class="data"><%= baiDang.getMaThanhVien() %></td>
                        <td class="data"><%= baiDang.getMaHuong() %></td>
                        <td class="data"><%= baiDang.getMaDanhMuc() %></td>
                        <td class="data"><%= baiDang.getMaTinh() %></td>
                        <td class="data"><%= baiDang.getTenBaiDang() %></td>
                        <td class="data"><%= baiDang.getTrangThai() %></td>                              
                        <td class="data" width="90px">
		                    <center>		                        		                       
		                        <a href="ChiTietThanhVienServlet?maThanhVienUrl=<%=baiDang.getMaBaiDang() %>">Xem chi tiết</a>&nbsp;&nbsp; &nbsp;&nbsp;                        
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
