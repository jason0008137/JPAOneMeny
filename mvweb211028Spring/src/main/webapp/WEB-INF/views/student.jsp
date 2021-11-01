<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC 表單處理</title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form method="POST" encType="application/x-www-form-urlencoded;charset=UTF-8" action="/mvweb211028Spring/addStudent">
		<table>
			<tr>
				<td><form:label path="name">名字:</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">年齡:</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="id">編號:</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交表單" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>