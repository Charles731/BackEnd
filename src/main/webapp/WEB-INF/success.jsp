<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dellpc
  Date: 2017/11/2
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功</title>
</head>
<body>
<c:out value="${u_name}" />
<br>
<c:out value="${password}" />
<a href="${pageContext.request.contextPath }/jsp/login.jsp">去登录</a>
</body>
</html>
