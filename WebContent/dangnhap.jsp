<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/login.css" />
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Đăng nhập</title>
</head>
<body>
	<script type="text/javascript">
		function validate(){
			var email = document.getElementById('txtEmail').value;
			if(email=""){
				alert("Vui lòng nhập email!");
				return false;
			}
			var matKhau = document.getElementById('txtMatKhau').value;
			if(matKhau=""){
				alert("Vui lòng nhập mật khẩu!");
				return false;
			}
			
		} 
		
	</script>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="login-screen"></div>
    <div class="login-center">
        <div class="container min-height" style="margin-top: 20px;">
        	<div class="row">
                <div class="col-xs-4 col-md-offset-8">
                    <div class="login" id="card">
                    	<div class="front signin_form"> 
                        <p>Login Your Account</p>
                          <form onsubmit="return validate();" class="login-form" action="DangNhapTrangChuServlet" method="POST">
                              <div class="form-group">
                                  <div class="input-group">
                                      <input id="txtEmail" type="email" class="form-control" name="email" placeholder="Type your email">
                                      <span class="input-group-addon">
                                          <i class="glyphicon glyphicon-user"></i>
                                      </span>
                                  </div>
                              </div>
                              <div class="form-group">
                                  <div class="input-group">
                                      <input id="txtMatKhau" type="password" class="form-control" placeholder="Type your password" name="matkhau">
                                      <span class="input-group-addon">
                                          <i class="glyphicon glyphicon-lock"></i>
                                      </span>
                                  </div>
                              </div>
                            <%
                            	String error = (String)request.getAttribute("error");
                            	if(error!=null){                            		
                            	
                            %>
                            <h5 style="color: red;">
                            	<%=error %>
                            </h5>
                            <%} %>
                              
                              <div class="form-group sign-btn">
                                  <button  class="bn" type="submit" name="submit" value="submit">Login</button>   
                                  <p><a href="#" class="forgot">Can't access your account?</a></p>
                                  <p><strong>New to TimeInfo?</strong><br><a href="dangkythanhvien.jsp" id="flip-btn" class="signup signup_link">Sign up for a new account</a></p>
                              </div>
                          </form>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

</body>
</html>