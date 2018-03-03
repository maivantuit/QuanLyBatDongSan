<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý chi tiết thành viên</title>        
     	<link href="css/mos-style.css" rel='stylesheet' type='text/css' /> <!--../ ; ./: dai dien cho ky tu cung hang  -->	

    </head>
    <body>      

		<%
		ThanhVien thanhVien = (ThanhVien)request.getAttribute("thanhVien");
		%>
		
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý chi tiết thành viên</h3>       
                    
                    <div id="quanlychitietthanhvien">
                    	<div id="anhdaidien">
                    		<img alt="" src="">
                    	</div>
                    	<div id="info">
                    		<table>
                    			<tr>
                    				<td>Mã thành viên: <%= thanhVien.getMaThanhVien() %></td>                    				                    				
                    			</tr>
                    			<tr>
                    				<td>Tên thành viên: <%= thanhVien.getTenThanhVien() %></td>
                    			</tr>                    			
                    			<tr>
                    				<td>Email:<%= thanhVien.getEmail() %></td>
                    			</tr>
                    			<tr>
                    				<td>Địa chỉ:<%= thanhVien.getDiaChi() %></td>
                    			</tr>
                    			<tr>
                    				<td>Số điện thoại:<%= thanhVien.getSdt() %></td>
                    			</tr>
                    			<tr>
                    				<td>
                    				
                    					<button>Khóa tài khoản</button>
									</td>
                    			</tr>
                    		</table>
                    	</div>
                    </div>
                    <a href="insert_danhmuc.jsp">Tìm kiếm</a>
                    <input type="text" placeholder="Search..">
                    <%
                    	ArrayList<BaiDang> listBaiDangCode = (ArrayList<BaiDang>)request.getAttribute("listBaiDangCode");
                    %>
                    <form action="DanhSachThanhVienServlet" method="POST">
                    </form>
                    <table class="data">
                        <tr class="data">                           
                            <th class="data" >STT</th>
                            <th class="data" >Mã bài đăng</th>                            
                            <th class="data">Mã loại bài đăng</th>
                            <th class="data">Mã tên bài đăng</th>
                            <th class="data">Mã thành viên</th>
                            <th class="data">Mã hướng</th>
                            <th class="data">Mã danh mục</th>
                            <th class="data">Mã tĩnh</th>
                            <th class="data">Mã quận huyện</th>
							<th class="data">Mã phường xã</th>
							<th class="data">Trạng thái</th>							                                                                                                             
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                    	int dem=0;
                    	for(BaiDang baiDang : listBaiDangCode){
                    	dem++;
                    	
                    %>                                                    
                    <tr class="data">                        
                        <td class="data"><%=dem %></td>
                        <td class="data"><%=baiDang.getMaBaiDang() %></td>
                        <td class="data"><%=baiDang.getMaLoaiBaiDang() %></td>
                        <td class="data"><%=baiDang.getTenBaiDang() %></td>                              
                        <td class="data"><%=baiDang.getMaThanhVien() %></td>
                        <td class="data"><%=baiDang.getMaHuong() %></td>
                        <td class="data"><%=baiDang.getMaDanhMuc() %></td>
                        <td class="data"><%=baiDang.getMaTinh() %></td>
                        <td class="data"><%=baiDang.getMaQuanHuyen() %></td>
                        <td class="data"><%=baiDang.getMaPhuongXa() %></td>
                        <td class="data"><%=baiDang.getTrangThai() %></td>
                        
                        <td class="data" width="90px">
		                    <center>
		                        <a href="/websiteshopcopdoan/admin/update_danhmuc.jsp?command=updateurl&MaDMSPurl=">Gỡ bỏ</a>&nbsp;&nbsp; &nbsp;&nbsp;                        
		                    </center>
	                    </td>
                    </tr>    
                    <%} %>
                                 
                </table>
            </div>
            <div class="clear"></div> 
            <jsp:include page="footer.jsp"></jsp:include> 
        </div>
    </body>
</html>
