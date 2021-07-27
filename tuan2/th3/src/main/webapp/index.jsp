<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/07/2021
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>currency converter</h1>
  <form action="/converter" method="get">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD"/><br/>
    <button type="submit">converter</button>
  </form>
  </body>
</html>
