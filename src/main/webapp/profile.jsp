<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
session = request.getSession(false);
Object account_id = session.getAttribute("account_id");
if(account_id == null){
	response.sendRedirect("/access");
}

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<jsp:include page="headerImports.jsp"></jsp:include>
</head>
<header>
 <jsp:include page="topNav.jsp"></jsp:include>
</header>
<body>

Welcome to profile section <%=account_id%>







</body>
<jsp:include page="footerImports.jsp"></jsp:include>
</html>