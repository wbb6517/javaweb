<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/9
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>example01</title>
</head>
<body>
<%!
    int a = 1;
    int b = 2;
%>
<%!
    public String myprint() {
        return "wbb";
    }
%>
<%
    out.println(a + b);
%>
<br>
<%
    out.println(myprint());
%>
<br>
<%=a + b%>
<br>
<%=myprint()%>
</body>
</html>
