<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/11
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>login</title>
    <style type="text/css">
        * {
            font-weight: bold;
            font-family: 微软雅黑;
            font-size: 24px
        }
    </style>
</head>
<body>
<div align="center" style="font-weight: bold; font-size: 18px">
    <h3>用户登录</h3>
    <form action="/javaweb_war_exploded/JDBCLoginServlet" method="post">
        <table border="1">
            <tr>
                <td height="30" align="center">昵&nbsp; 称 ：</td>
                <td>&nbsp;&nbsp; <input type="text" name="petName"/><font color="red">${errorMsg }</font></td>
            </tr>
            <tr>
                <td height="30" align="center">密 &nbsp; 码：</td>
                <td>&nbsp;&nbsp; <input type="password" name="userPassword"/></td>
            </tr>
            <tr>
                <td height="30" colspan="2" align="center">
                    <input type="submit" value="登录"/> &nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="reset" value="重置"/>
                    <a href="/javaweb_war_exploded/jdbc/registered.jsp">前去注册</a>
                </td>

            </tr>
        </table>
    </form>
</div>
</body>
</html>
