<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.hj.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/5/23
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <%
    List<User> list = new ArrayList<>();
    list.add(new User("张三",22));
    list.add(new User("李四",21));
    list.add(new User("王二麻子",21));
  %>
    <table>
      <tr>
        <th>姓名</th>
        <th>年龄</th>
      </tr>
      <%
        for(int i = 0; i < list.size() ;i++){
      %>
        <tr>
          <td>
            <%=list.get(i).getName()%>
          </td>
          <td>
            <%=list.get(i).getAge()%>
          </td>
        </tr>
      <%
        }
      %>
    </table>

<%--  <%--%>
<%--    List<String> name = new ArrayList<>();--%>
<%--    name.add("张三");--%>
<%--    name.add("李四");--%>
<%--    name.add("小白");--%>

<%--    List<Integer> age = new ArrayList<>();--%>
<%--    age.add(11);--%>
<%--    age.add(22);--%>
<%--    age.add(33);--%>
<%--  %>--%>

<%--  <table>--%>
<%--    <tr>--%>
<%--      <th>姓名</th>--%>
<%--      <th>年龄</th>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--      for(int i = 0; i < name.size() ;i++){--%>
<%--    %>--%>
<%--      <tr>--%>
<%--        <td>--%>
<%--          <%=name.get(i)%>--%>
<%--        </td>--%>
<%--        <td>--%>
<%--          <%=age.get(i)%>--%>
<%--        </td>--%>
<%--      </tr>--%>
<%--    <%--%>
<%--      }--%>
<%--    %>--%>
<%--  </table>--%>


<%--  <%!--%>
<%--   public String test(){--%>
<%--     return "你好A，java";--%>
<%--   }--%>
<%--  %>--%>
<%--<%--%>
<%--    String str = test();--%>
<%--%>--%>
<%--  <%=str %>--%>


  </body>
</html>
