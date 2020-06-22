<%--
  Created by IntelliJ IDEA.
  User: arun kumar
  Date: 22-06-2020
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="Registration" method="post">
    <table>
        <tr> <td> Registration Page </td></tr>
        <tr> <td>Enter User Name : </td> <td> <input type="text" name="userName"></td></tr>
        <tr> <td>Enter User Id : </td> <td> <input type="text" name="userId"></td></tr>
        <tr> <td>Enter Password : </td> <td> <input type="password" name="password"></td></tr>
        <tr> <td>Retype Password : </td> <td> <input type="password" name="retypePassword"></td></tr>
        <tr> <td><input type="submit" value="Register"></td></tr>
    </table>
</form>
</body>
</html>
