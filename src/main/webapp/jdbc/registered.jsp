<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/12
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>注册</title>
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
        <h3>用户注册</h3>
        <form action="/javaweb_war_exploded/JDBCRegisterServlet" method="post">
            <table border="1">
                <tr>
                    <td height="30" align="center">昵称：</td>
                    <td>&nbsp;&nbsp;<input type="text" name="petName"/><font color=#999999>请输入不大于20个字符的昵称</font></td>
                </tr>
                <tr>
                    <td height="30" align="center">姓名：</td>
                    <td>&nbsp;&nbsp;<input type="text" name="userNameTrue"/><font color=#999999>请输入不大于20个字符的真实姓名</font></td>
                </tr>
                <tr>
                    <td height="30" align="center">密码：</td>
                    <td>&nbsp;&nbsp;<input type="password" name="userPassword"/><font color=#999999>请输入不大于10个字符的真实姓名</font></td>
                </tr>
                <tr>
                    <td height="30" align="center">性别：</td>
                    <td>
                        &nbsp;&nbsp;<input type="radio" name="gender" value="男" checked="checked" /> 男
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" name="gender" value="女" /> 女
                    </td>
                </tr>
                <tr>
                    <td height="30" align="center">邮箱：</td>
                    <td>&nbsp;&nbsp;<input type="text" name="email"/><font color=#999999>请输入正确格式的电子邮件</font></td>
                </tr>
                <tr>
                    <td height="30" align="center">地址：</td>
                    <td>&nbsp;&nbsp;<input type="text" name="address"/><font color=#999999></font></td>
                </tr>
                <tr>
                    <td height="30" colspan="2" align="center">
                        <input type="submit" value="注册"/> &nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="重置"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
