<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<jsp:include page="headerImports.jsp"></jsp:include>
</head>
<header>
	<jsp:include page="topNav.jsp"></jsp:include>
</header>
<body>
<br><br><br>

	<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
			<form action="./customerLogin">
			<div class="form-group">
				<input type="email" class="form-control" placeholder="Email"
					name="email" id="email" required="required">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" placeholder="Password"
					name="password" id="password" required="required">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-success">Login In</button>
			</div>
			</form>
		</div>
		<div class="col-3"></div>
	</div>






</body>
<jsp:include page="footerImports.jsp"></jsp:include>
</html>