<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<c:out value="${param.username }" escapeXml="false">
  <meta http-equiv="refresh" 	content="5;url=http://www.itcast.cn" />
</c:out>
</body>
</html>
