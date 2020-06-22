<%--
  Created by IntelliJ IDEA.
  User: arun kumar
  Date: 22-06-2020
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="Login" method="post">
    <table>
        <tr> <td> Login Page </td></tr>
        <tr> <td>Enter UserId : </td> <td> <input type="text" name="userId"></td></tr>
        <tr> <td>Enter Password : </td> <td> <input type="password" name="password"></td></tr>
        <tr> <td><input type="submit" value="Login"></td><td><a href="register.jsp">Registration</a></td></tr>
    </table>
</form>
</body>
</html>
