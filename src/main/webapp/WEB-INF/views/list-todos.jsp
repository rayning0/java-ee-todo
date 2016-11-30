<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>To-Dos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>
	<nav class="navbar navbar-default">
		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todos.do">To-Dos</a></li>
			<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<h1>Welcome ${name}</h1>
		<p>Your To-Dos:</p>
		<table class="table table-striped">
			<caption></caption>
			<tr>
				<th>ID</th>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</tr>
			<tbody>
				<c:forEach var="todo" items="${todos}">
					<tr>
						<td>${todo.key}</td>
						<td>${todo.value[0]}</td>
						<td>${todo.value[1]}</td>
						<td><a href="/delete-todo.do?id=${todo.key}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<p><font color="red">${errorMessage}</font></p>
		<a href="/add-todo.do" class="btn btn-success">Add New To-Do</a>
	</div>

	<footer class="footer">
		<div>footer content</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>