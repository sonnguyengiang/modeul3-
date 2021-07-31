<%@ page import="java.util.ArrayList" %>
<%@ page import="ql.Sp" %>

Created by IntelliJ IDEA.
  User: Admin
  Date: 28/07/2021
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Product Table</h2>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Sp> list = (ArrayList<Sp>) request.getAttribute("listSp");
            String str ="";
            for (Sp p:list) {
                str +="<tr> <td>" + p.getId() + "</td><td>" + p.getName() + "</td><td>" + p.getGia()+ "</td></tr>";
            }
            out.println(str);
        %>
        </tbody>
    </table>
</div>
<a href="/index.jsp" class="btn btn-success">Create</a>
</body>
</html>
