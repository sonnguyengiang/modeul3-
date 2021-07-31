<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/07/2021
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Customer table</h2>
  <table class="table">
    <thead class="thead-light">
    <tr>
      <th>Name</th>
      <th>date</th>
      <th>address</th>
      <th>img</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCustomer}" var="customer">
      <tr>
        <td>${customer.name}</td>
        <td>${customer.ngaysinh}</td>
        <td>${customer.address}</td>
        <td><img src="${customer.img}" width="100%" height="100px"></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
