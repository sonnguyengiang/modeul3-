<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/07/2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style type="text/css">
        .login {
            height:180px; width:230px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .login input {
            padding:5px; margin:5px
        }
    </style>
</head>
<body>
<form action="/login" method="post">
    <div class="login">
        <h1>Login</h1>
        <input placeholder="user" name="use"><br>
        <input placeholder="password" name="pass"><br>
        <br>
        <button type="submit">login</button>
    </div>
</form>
</body>
</html>
