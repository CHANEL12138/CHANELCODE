
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>发起some.do请求</p>
    <br>
    <a href="user/some.do">发起请求</a>
    <form action="user/some.do">

        <input type="submit">
    </form>


    <p>请求参数名和处理器方法的形参名不一样</p>
    <form action="user/other.do" method="post">
        姓名：<input type="text" name="iname"/><br/>
        年龄：<input type="text" name="iage"/><br/>
        <input type="submit" value="提交参数">
    </form>
    <br>
    <form action="user/form1.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">
    </form>

</body>
</html>
