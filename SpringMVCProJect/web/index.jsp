<%--
  Created by IntelliJ IDEA.
  User: CHANEL
  Date: 2021/6/28
  Time: 19:16
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
    <title>SSM项目主页</title>
  <base href="<%=basePath%>">
</head>
<body>
  <div align="center">
    <table>
      <tr>
        <td><a href="addStu.jsp">添加学生</a></td>
      </tr>
      <tr>
        <td><a href="listStudent.jsp">浏览学生</a></td>
      </tr>
    </table>
  </div>
</body>
</html>
