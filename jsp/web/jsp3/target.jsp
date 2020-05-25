<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/25
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>target</title>
</head>
<body>
<%
//    报错->因为重定向和转发的区别（1.转发：将请求传到下一个，重定向：重新开启一个请求，而且原来的请求结束了.2.所以，转发的话地址栏是不会发生变化，重定向的话地址栏会发生变化）
    String name = (String) request.getAttribute("name");
    out.write(name);
%>

</body>
</html>
