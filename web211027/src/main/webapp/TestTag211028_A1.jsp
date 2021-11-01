<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://mytag.test/jstl/fake"%>
<%-- <%@taglib uri="http://mytag.test/jstl/fake" prefix="f"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自訂 if 標籤</title>
</head>
<body>
	<f:if test="${param.password == '12345'}">
            你的秘密資料在此！
        </f:if>
</body>
</html>
