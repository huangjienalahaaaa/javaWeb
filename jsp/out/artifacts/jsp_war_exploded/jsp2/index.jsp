<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/25
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp2</title>
</head>
<body>
<%
    String[] names =request.getParameterValues("name");

%>
<%--Arrays.toString的作用：将数组里值取出来，然后拼接到一起--%>
<%=Arrays.toString(names)%>

<%--<%--%>
<%--    String idStr = request.getParameter("id");--%>
<%--    Integer id = Integer.parseInt(idStr);--%>
<%--    id++;--%>
<%--//    将数据存入到request中--%>
<%--    request.setAttribute("number",id);--%>
<%--//    将请求转发给test2.jsp--%>
<%--    request.getRequestDispatcher("test.jsp").forward(request,response);--%>
<%--%>--%>
</body>
</html>
