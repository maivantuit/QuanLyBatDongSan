<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/sigup.css" />
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
.container {
	background-image: url(image/login.jpg);
	background-position: center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	-moz-background-size: cover;
	-webkit-background-size: cover;
	position: fixed;
	top: 0;
	bottom: 0;
	right: 0;
	left: 0;
	height: 100%;
	width: 100%;
}
</style>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="SigupController" method="post">
<div class="container">
<div class="col-md-3"></div>
<div class="col-md-6">
<div class="row myborder">
<h4 style="color: #7EB59E; margin: initial; margin-bottom: 10px;">Sign
Up Now</h4>
<hr>
<div class="input-group margin-bottom-20"><span
	class="input-group-addon"><i
	class="glyphicon glyphicon-user mycolor"></i></span> <input size="60"
	maxlength="255" class="form-control" placeholder="User Name"
	name="username" id="UserRegistration_username" type="text"></div>
<div class="input-group margin-bottom-20"><span
	class="input-group-addon"><i
	class="glyphicon glyphicon-lock mycolor"></i></span> <input size="60"
	maxlength="255" class="form-control" placeholder="Password"
	name="password" id="UserRegistration_password" type="password">
</div>
<div class="input-group margin-bottom-20"><span
	class="input-group-addon"><i
	class="glyphicon glyphicon-user mycolor"></i></span> <input size="60"
	maxlength="255" class="form-control" placeholder="Address"
	name="address" id="UserRegistration_lname" type="text"></div>
<div class="input-group margin-bottom-20"><span
	class="input-group-addon"><i
	class="glyphicon glyphicon-envelope mycolor"></i></span> <input size="60"
	maxlength="255" class="form-control" placeholder="Email" name="email"
	id="UserRegistration_address" type="text"></div>
<div class="input-group margin-bottom-20"><span
	class="input-group-addon"><i
	class="glyphicon glyphicon-phone mycolor"></i></span> <input size="60"
	maxlength="255" class="form-control" placeholder="Contact Number"
	name="contactnumber" id="UserRegistration_contactnumber" type="text">
</div>

<div class="row">
<div class="col-md-12">
<button class="btn-u pull-left" type="submit">Sign Up</button>
</div>
</div>
</div>
<div class="col-md-2"></div>
</div>
</div>
</form>
</body>
</html>