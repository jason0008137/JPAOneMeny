<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Product Page</title>
</head>
<body>

	<h3>Products Page</h3>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.pid }</td>
				<td>${product.name }</td>
				<td><img src="${pageContext.request.contextPath }/${product.path }" width="150"></td>
				<td>${product.des }</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.pid}">Buy Now</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
