<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
使用绝对路径构造URL:<br />
<c:url var="myURL"
       value="http://localhost:8080/javaweb_war_exploded/index.jsp">
    <c:param name="name" value="张三" />
    <c:param name="pass" value="123456" />
</c:url>
<a href="${myURL}">index.jsp</a><br />
使用相对路径构造URL:<br />
<c:url var="myURL"
       value="index.jsp?username=Tom&country=France" />
<a href="${ myURL}">index.jsp</a>
</body>
</html>
