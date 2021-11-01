<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Spring MVC 表單處理</title>
</head>
<body>
	<h2>提交的學生資訊如下 -</h2>
	<table>
		<tr>
			<td>名稱:</td>
<%-- 			<td>${name}</td> --%>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td>年齡:</td>
<%-- 			<td>${age}</td> --%>
			<td>${student.age}</td>
		</tr>
		<tr>
			<td>編號:</td>
<%-- 			<td>${id}</td> --%>
			<td>${student.id}</td>
		</tr>
	</table>
</body>
</html>