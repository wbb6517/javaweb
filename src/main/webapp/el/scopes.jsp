<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/10
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scopes</title>
</head>
<body>
<% pageContext.setAttribute("userName", "itcast"); %>
<% request.setAttribute("bookName", "Java Web"); %>
<% session.setAttribute("userName", "itheima"); %>
<% application.setAttribute("bookName", "Java 基础"); %>
表达式\${pageScope.userName}的值为：${pageScope.userName} <br />
表达式\${requestScope.bookName}的值为：${requestScope.bookName} <br />
表达式\${sessionScope.userName}的值为：${sessionScope.userName} <br />
表达式\${applicationScope.bookName}的值为：${applicationScope.bookName}
<br />
表达式\${userName}的值为：${userName}
</body>
</html>
