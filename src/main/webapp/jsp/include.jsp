<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/9
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include</title>
</head>
<body>
包含页面
<%--<%@include file="date.jsp"%>--%>
<jsp:include page="date.jsp" flush="false"></jsp:include>
</body>
</html>
