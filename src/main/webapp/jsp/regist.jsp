<%--
  Created by IntelliJ IDEA.
  User: dellpc
  Date: 2017/11/2
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>用户注册</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/regist" method="post">
        <table border="1">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="u_name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>
                <td>电子邮箱</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>

    </form>

</body>
</html>
