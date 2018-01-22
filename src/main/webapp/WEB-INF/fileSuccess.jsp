<%--
  Created by IntelliJ IDEA.
  User: dellpc
  Date: 2017/11/10
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    成功
    <h3>文件下载</h3>
    <a href="${pageContext.request.contextPath}/file/download?downLoadFile=${fileName}">

        ${fileName}.jsp
    </a>
</body>
</html>
