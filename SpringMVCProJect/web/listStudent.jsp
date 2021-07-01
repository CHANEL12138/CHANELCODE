<%--
  Created by IntelliJ IDEA.
  User: CHANEL
  Date: 2021/6/28
  Time: 19:37
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
    <title>查询学生 ajax</title>
  <base href="<%=basePath%>">
  <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
  <script>
    $(function () {
      LoadStu();
      $("#btn").click(function () {
        LoadStu();
      })
    })

function LoadStu() {
  $.ajax(
          {
            url:"stu/queryStu",
            type:"get",
            dataType:"json",
            success:function (data) {
              $("#info").html("");
              $.each(data,function (i,n) {
                $("#info").append("<tr>")
                        .append("<td>"+n.id+"</td>")
                        .append("<td>"+n.name+"</td>")
                        .append("<td>"+n.age+"</td>")
                        .append("</tr>")
              })
            }
          }
        )
}


  </script>


</head>
<body>
<div align="center">
  <table>
    <thead>
    <tr>
      <td>学号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>
    </thead>
    <tbody id="info">


    <input type="button" id="btn" value="查询学生">
    </tbody>
  </table>
</div>
</body>
</html>
