<%--
  Created by IntelliJ IDEA.
  User: Better~my
  Date: 2019/10/19
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        ${msg}<br/>
        登录名：<input type="text" name="username" id="username"> <br/>
        密&nbsp;&nbsp;&nbsp;码: <input type="password" name="password" id="password"> <br/>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
