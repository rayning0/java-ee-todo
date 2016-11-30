<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				<label>Description:</label>
				<input type="text" name="name" class="form-control"><br>
			</fieldset>
			<fieldset class="form-group">
				<label>Category:</label>
				<input type="text" name="category" class="form-control"><br>
			</fieldset>
			<input type="submit" class="btn btn-success" value="Add">
		</form>
	</div>

<%@ include file="../common/footer.jspf" %>
