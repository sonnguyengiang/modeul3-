<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/07/2021
  Time: 09:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CreateAccount</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Create account table</h2>
    <p class="font-weight-light">enter information</p>
    <form action="/account?action=create" method="post">
        <table class="table">
            <thead class="thead-light">
            <tr>
                <td>ID</td>
                <td>username</td>
                <td>password</td>
                <td>gmail</td>
                <td>Create</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input name="id" placeholder="Nhập id"></td>
                <td><input name="userName" placeholder="Nhập userName"></td>
                <td><input name="password" placeholder="Nhập password"></td>
                <td><input name="gmail" placeholder="Nhập gmail"></td>
                <td><button type="submit" class="btn btn-success">Create</button></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
