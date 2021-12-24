<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/9
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>exception</title>
</head>
<body>
<%
    int a = 3;
    int b = 0;
%>
输出结果为：<%=(a / b)%><!--此处会产生异常  -->
</body>
</html>
