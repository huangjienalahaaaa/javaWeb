<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/25
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    Integer number = (Integer) request.getAttribute("number");
    request.getRequestDispatcher("test2.jsp").forward(request,response);
%>
</body>
</html>
