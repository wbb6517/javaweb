<%--
  Created by IntelliJ IDEA.
  User: 王犇犇
  Date: 2021/11/10
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext</title>
</head>
<body>
请求URI为：${pageContext.request.requestURI} <br />
Content-Type响应头：${pageContext.response.contentType} <br />
服务器信息为：${pageContext.servletContext.serverInfo} <br />
Servlet注册名为：${pageContext.servletConfig.servletName} <br />
</body>
</html>
