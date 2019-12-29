<%--
  Created by IntelliJ IDEA.
  User: Better~my
  Date: 2019/10/19
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理主页</title>
</head>
<body>
    当前用户信息：${user_session.username}
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
