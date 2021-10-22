<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Place</th>
		</tr>
		<c:forEach var="products" items="${products}">
			<tr>
				<td><c:out value="${products.pid}" /></td>
				<td><c:out value="${products.pname}" /></td>
				<td><c:out value="${products.price}" /></td>
				<td><c:out value="${products.place}" /></td>
			</tr>
		</c:forEach>
		</tr>
	</table>
</body>
</html>