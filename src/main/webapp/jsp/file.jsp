<%--
  Created by IntelliJ IDEA.
  User: dellpc
  Date: 2017/11/10
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h2>文件上传</h2>
    <form action="${pageContext.request.contextPath}/file/upload" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>请选择文件</td>
                <td><input type="file" name="upLoadFile"></td>
            </tr>
            <tr>
                <td><input type="submit" value="上传"></td>
            </tr>
        </table>
    </form>

</body>
</html>
