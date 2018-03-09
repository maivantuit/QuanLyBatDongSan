<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./css/top.css">
<script src="./js/jquery-1.11.2.min.js"></script>
<script src="./js/image.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		<div class="w3-container" style="margin-top: 80px" id="showcase">
			
			<h1 class="w3-xxxlarge w3-text-red">
				<b>Phòng Ở.</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
		</div>

		<div class="w3-row-padding">
			<div class="w3-half">
				<img src="image/anh1.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Concrete meets bricks"> <img
					src="image/anh2.jpg" style="width: 100%" onclick="onClick(this)"
					alt="Light, white and tight scandinavian design"> <img
					src="image/anh3.jpg" style="width: 100%" onclick="onClick(this)"
					alt="White walls with designer chairs">
			</div>

			<div class="w3-half">
				<img src="image/anh4.jpg" style="width: 100%"
					onclick="onClick(this)" alt="Windows for the atrium"> <img
					src="image/anh5.jpg" style="width: 100%" onclick="onClick(this)"
					alt="Bedroom and office in one space"> <img
					src="image/anh6.jpg" style="width: 100%" onclick="onClick(this)"
					alt="Scandinavian design">
			</div>
		</div>

		<div id="modal01" class="w3-modal w3-black" style="padding-top: 0"
			onclick="this.style.display='none'">
			<span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
			<div
				class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
				<img id="img01" class="w3-image">
				<p id="caption"></p>
			</div>
		</div>
	</div>
</body>
</html>