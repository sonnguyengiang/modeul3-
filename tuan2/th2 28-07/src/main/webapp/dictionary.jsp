<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/07/2021
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    Map<String, String> list = new HashMap<>();
%>
<%
    list.put("hello", "xin chao");
    list.put("goodbye", "tam biet");
    list.put("good morning", "xin chao buoi sang");
    list.put("price", "gia");
    list.put("kind of", "dai khai");

    String search  = request.getParameter("search");

    String result = list.get(search);
    if (result != null){
        out.println("Word: " + search);
        out.println("<br>");
        out.println("Result: " + result);
    } else {
        out.println("not found");
    }
%>
<br>
<a href="/index.jsp" class="btn btn-success">back</a>
</body>
</html>
