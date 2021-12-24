<%@ page import="cn.edu.lzit.beanutils.Person" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/10
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>myeljsp</title>
</head>
<body>
<%=request.getAttribute("username")%>
<br>
<%=request.getAttribute("password")%>
<hr>
${username}
<br>
${password}
<hr>
<%
    Person person = new Person();
        person.setName("王犇犇");
        request.setAttribute("person",person);
%>
${person.name}
<hr>
<%
    HashMap<String, String> map = new HashMap<>();
    map.put("my-map","666");
    request.setAttribute("key",map);
%>
${key["my-map"]}
</body>
</html>
