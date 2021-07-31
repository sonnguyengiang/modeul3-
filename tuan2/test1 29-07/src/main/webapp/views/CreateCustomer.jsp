<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/07/2021
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create customer</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Create customer</h2>
    <p class="font-weight-light">Enter information</p>
    <form action="/customer?action=create" method="post">
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Create</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input name="id" placeholder="nhập id"></td>
                <td><input name="name" placeholder="nhập tên"></td>
                <td><input name="gmail" placeholder="nhập gmail"></td>
                <td><input name="address" placeholder="Nhập địa chỉ"></td>
                <td><button type="submit" class="btn btn-success">Create</button></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
