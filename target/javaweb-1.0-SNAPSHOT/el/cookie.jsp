<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/10
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie</title>
</head>
<body>
<% response.addCookie(new Cookie("userName", "itcast")); %>
Cookie对象的信息：<br />
${cookie.userName } <br />
Cookie对象的名称和值：<br />
${cookie.userName.name }=${cookie.userName.value }

</body>
</html>
