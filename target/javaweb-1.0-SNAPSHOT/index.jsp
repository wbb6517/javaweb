<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/7
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <form action="http://localhost:8080/javaweb_war_exploded/MyHttpServlet" method="get">
        用户名: <input type="text" name="name" style="width: 150px"/>
        <p/>
        密码: <input type="password" name="pass" style="width: 150px"/>
        <p/>
        <input type="submit" value="get请求"/>
        <p/>
    </form>
    <form action="http://localhost:8080/javaweb_war_exploded/MyHttpServlet" method="post">
        用户名: <input type="text" name="name" style="width: 150px"/>
        <p/>
        密码: <input type="password" name="pass" style="width: 150px"/>
        <p/>
        <input type="submit" value="post请求"/>
        <p/>
    </form>

</body>
</html>
