<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/10
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/el/param.jsp">
    num1：<input type="text" name="num1"><br/>
    num2：<input type="text" name="num"><br/>
    num3：<input type="text" name="num"><br/> <br/>
    <input type="submit" value="提交"/>&nbsp;&nbsp;
    <input type="submit" value="重置"/>
    <hr>
    num1：${param.num1}<br/>
    num2：${paramValues.num[0]}<br/>
    num3：${paramValues.num[1]}<br/>
    <hr>
    ${pageContext.request.contextPath}
</form>
</body>
</html>
