<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/07/2021
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manage Account</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Account Table</h2>
    <p class="font-weight-light">The table class adds basic styling to a table:</p>
    <from>
        <a type="submit" href="/customer?action=create" class="btn btn-success">Create</a>
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listCustomer}" var="customer" varStatus="loop">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.gmail}</td>
                    <td>${customer.address}</td>
                    <td><a href="/customer?action=edit&index=${loop.index}" type="button" class="btn btn-warning">edit</a></td>
                    <td><a href="/customer?action=delete&index=${loop.index}" type="button" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </from>
</div>
</body>
</html>
