<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="70%">
		<tr>
			<th>cofName</th>
			<th>price</th>
			<th>sales</th>
			<th>total</th>
			<th>supplier id</th>

		</tr>
		<c:forEach var="CofList" items="${CofList}">
			<tr>
				<td><c:out value="${CofList.cofName}" /></td>
				<td><c:out value="${CofList.price}" /></td>
				<td><c:out value="${CofList.sales}" /></td>
				<td><c:out value="${CofList.total}" /></td>
				<td><c:out value="${CofList.supplier.supId}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>