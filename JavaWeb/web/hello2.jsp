<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: CHANEL
  Date: 2021/7/1
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<%--<%--%>
<%--  String s = (String) request.getAttribute("name");--%>
<%--  String s1 = (String) request.getAttribute("age");--%>
<%--  String s2 = (String) request.getAttribute("email");--%>
<%--  List<String> list = new ArrayList<>();--%>
<%--  list.add(s);--%>
<%--  list.add(s1);--%>
<%--  list.add(s2);--%>
<%--%>--%>





<table>
  <tr>
    <td>姓名</td>
    <td>年龄</td>
    <td>邮箱</td>
  </tr>
<%--  <tr>--%>
<%--  <%--%>
<%--    for(String a:list)--%>
<%--    {--%>
<%--      %>--%>
<%--    <td><%=a%></td>--%>
<%--  <%--%>
<%--    }--%>
<%--  %>--%>
<%--  </tr>--%>
  <tr>

    <c:foreach items="${list}" val="str">
        <td>${str}</td>
    </c:foreach>
  </tr>


</table>
</body>
</html>
