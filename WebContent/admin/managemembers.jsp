<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý thành viên</title>        
     	<link href="css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->	

    </head>
    <body>      

		<%
			ArrayList<ThanhVien> danhSachThanhVienjsp = (ArrayList<ThanhVien>)request.getAttribute("danhSachThanhVien");
		%>
		
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý thành viên</h3>       
                    <a href="insert_danhmuc.jsp">Tìm kiếm</a>
                    <input type="text" placeholder="Search..">
                    <form action="DanhSachThanhVienServlet" method="POST">
                    </form>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã thành viên</th>
                            <th class="data">Tên thành viên</th>
                            <th class="data">Địa chỉ</th>                                                                                 
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                    	int dem=0;
                    	for(ThanhVien thanhVien : danhSachThanhVienjsp){
                    	dem++;
                    %>                                                                        
                    <tr class="data">
                        <td class="data" width="30px"><%=dem %></td>
                        <td class="data"><%= thanhVien.getMaThanhVien() %></td>
                        <td class="data"><%= thanhVien.getTenThanhVien() %></td>
                        <td class="data"><%= thanhVien.getDiaChi() %></td>                              
                        <td class="data" width="90px">
		                    <center>		                        		                       
		                        <a href="ChiTietThanhVienServlet?maThanhVienUrl=<%=thanhVien.getMaThanhVien() %>">Xem chi tiết</a>&nbsp;&nbsp; &nbsp;&nbsp;                        
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
