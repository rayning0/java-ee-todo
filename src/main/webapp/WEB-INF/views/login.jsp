<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Raymond JSP</title>
</head>
<%-- <% 
	 System.out.println(request.getParameter("name"));
%> --%>
<body>
	<%-- My first JSP page ${name} and password is ${password} --%>
	<p><font color="red">${errorMessage}</font></p>
	<form action="/login.do" method="post">
		Name: <input type="text" name="name"> 
		Password: <input type="password" name="password">  
		<input type="submit" value="Login">
	</form>
</body>
</html>