<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2023/08/09
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/calc/makeResult" method="post">
        <input type="text" name="num1"/>
        <input type="text" name="num2"/>
        <input type="submit" value="전송">
    </form>
</body>
</html>
