<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>save</title>
</head>
<body>
<h2>测试保存</h2>
<form action="user/saveUser" method="post">
    用户名：<input type="text" name="username"><br>
    余额：<input type="text" name="balance"><br>
    <input type="submit">
</form>
</body>
</html>