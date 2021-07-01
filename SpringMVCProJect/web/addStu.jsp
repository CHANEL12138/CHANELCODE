<%--
  Created by IntelliJ IDEA.
  User: CHANEL
  Date: 2021/6/28
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
  String basePath = request.getScheme()+"://" +
          request.getServerName() + ":" + request.getServerPort() +
          request.getContextPath() + "/";
%>

<html>
<head>
    <title>添加学生</title>
  <base href="<%=basePath%>">
</head>
<body>

<div align="center">
  <form action="stu/addStu" method="post">
    姓名:
    <input type="text" value="姓名" name="name">
    <br>
    年龄：
    <input type="text" value="年龄" name="age">
    <br>
    <input type="submit" value="提交">

  </form>
</div>
</body>
</html>
