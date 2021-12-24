<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/9
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>date</title>
</head>
<body>
<%
    out.println(new Date().toLocaleString());
    Thread.sleep(5000);
%>
这是被包含页面
</body>
</html>
