<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

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
	
<%@ include file="../common/footer.jspf" %>
