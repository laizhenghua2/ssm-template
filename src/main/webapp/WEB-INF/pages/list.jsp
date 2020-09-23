<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h3>查询了所有的账户信息</h3>
    <c:forEach items="${userList}" var="user">
        ${user.username}
    </c:forEach>
</body>
</html>