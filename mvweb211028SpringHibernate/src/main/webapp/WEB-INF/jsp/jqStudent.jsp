<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<h2>Student Information</h2>
	<form:form method="post" action="" onclick="return false">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" id="age" /></td>
			</tr>
			<tr>
				<td><form:label path="id">id</form:label></td>
				<td><form:input path="id" id="id" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"
					onclick="send()" /></td>
			</tr>
		</table>
	</form:form>
	<div id="div1"></div>
	<script>
		function send() {
			$.post("addStudent", {
				"age" : $("#age").val(),
				"name" : $("#name").val(),
				"id" : $("#id").val()
			}, function(data) {
				$("#div1").html(data);
			});
		}
	</script>
</body>

</html>
