<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>YOOOOOOOOOOO</title>
</head>
<body>
	<table border="1">
		<tr>
			<TH>Supplier ID</th>
			<TH>Name</th>
			<TH>Street</th>
			<TH>City</th>
			<TH>State</th>
			<TH>zip</th>
		</tr>
		<c:forEach var="current" items="${suppliers}">
			<tr>
				<td><c:out value="${current.SUP_ID}" /></td>
				<td><c:out value="${current.SUP_NAME}" /></td>
				<td><c:out value="${current.STREET}" /></td>
				<td><c:out value="${current.CITY}" /></td>
				<td><c:out value="${current.STATE}" /></td>
				<td><c:out value="${current.ZIP}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>