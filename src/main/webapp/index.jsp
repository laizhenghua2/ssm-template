<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>index</title>
</head>
<script type="text/javascript">
    document.location.href = "save.jsp"
</script>
<body>
<h3>hello welcome to springMVC spring myBatis</h3>
<a href="user/findAll">findAll</a>
</body>
</html>