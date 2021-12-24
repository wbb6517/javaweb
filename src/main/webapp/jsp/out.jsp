<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/9
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out</title>
</head>
<body>
<%
    out.println("first line<br />");
    response.getWriter().println("second line<br />");
%>
</body>
</html>
