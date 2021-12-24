<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/11
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="cn.edu.lzit.jdbc02.pojo.*" %>
<html>
<head>
    <title>welcome</title>
    <style type="text/css">
        * {
            font-weight: bold;
            font-family: 微软雅黑;
            font-size: 24px
        }
    </style>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
%>
<font color="red">欢迎您! 您的信息如下：</font>
<p>
    序号：<%=user.getNumber() %><br>
    昵称：<%=user.getPetName() %><br>
    姓名：<%=user.getUserNameTrue() %><br>
    密码：<%=user.getUserPassword() %><br>
    性别：<%=user.getGender() %><br>
    邮箱：<%=user.getEmail() %><br>
    地址 ：<%=user.getAddress() %><br>
</body>
</html>
