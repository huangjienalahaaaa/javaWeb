<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/25
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test2</title>
</head>
<body>
<%
    Integer number = (Integer) request.getAttribute("number");
%>
<%=number%>
</body>
</html>
