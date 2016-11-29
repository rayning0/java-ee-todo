<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Post</title>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<p>Your Todos:</p>
	<ul>

		<c:forEach var="todo" items="${todos}">
			<li>${todo.key}: ${todo.value} &nbsp; &nbsp; <a href="/delete-todo.do?id=${todo.key}">Delete</a></li>
		</c:forEach>
	</ul>
	
	<form action="/todo.do" method="post">
		<input type="text" name="name"> <input type="submit" value="Add">
	</form>
</body>
</html>