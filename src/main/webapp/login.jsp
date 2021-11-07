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
	<br>
	<br>
	<br>

	<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
			<form action="./customerLogin" method="POST">
				<p class="hint-text">Sign in with your social media account</p>
				<div class="form-group social-btn clearfix">
					<a href="#" class="btn btn-primary pull-left"><i
						class="fa fa-facebook"></i> Facebook</a> <a href="#"
						class="btn btn-info pull-right"><i class="fa fa-twitter"></i>
						Twitter</a>
				</div>
				<div class="or-seperator">
					<b>or</b>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Email"
						id="email" required="required">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password"
						id="password" required="required">
				</div>
				<input type="submit" class="btn btn-primary btn-block" value="Login">
				<div class="form-footer">
					<a href="#">Forgot Your password?</a>
				</div>
			</form>
		</div>
		<div class="col-3"></div>
	</div>






</body>
<jsp:include page="footerImports.jsp"></jsp:include>

</html>