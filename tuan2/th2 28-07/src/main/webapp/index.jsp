<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/07/2021
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Tu dien</title>
  <style>
    #khung{
      width: 200px;
      height: 30px;
    }
    #nut{
      width: 80px;
      height: 30px;
    }
  </style>
</head>
<body>
<h1> Vietnamese  Dictionary</h1>
<form action="dictionary.jsp" method="post">
  <input type="text" placeholder="enter your work" id="khung" name="search">
  <button type="submit" id="nut">translate</button>
</form>
</body>
</html>