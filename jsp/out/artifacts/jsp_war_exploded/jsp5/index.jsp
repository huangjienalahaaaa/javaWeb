<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/25
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<%
    int interval = session.getMaxInactiveInterval();
%>
<%=interval%>
</body>
</html>
