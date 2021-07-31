<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/07/2021
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="converter.jsp" method="post">
    <label for="rates">Rate: </label><br/>
    <input type="text" id="rates" name="rate" placeholder="RATE"/><br/>
    <label for="usds">USD: </label><br/>
    <input type="text" id="usds" name="usd" placeholder="USD"/><br/>
    <button type="submit">converter</button>
</form>
</body>
</html>
