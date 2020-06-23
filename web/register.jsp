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
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>

<div class="register">
    <div class="form">
        <form action="Registration" method="post">
            <h3>Registration Page </h3><br>
            <input type="text" name="userName" required placeholder="User Name"><br>
            <input type="number" name="userAge" required placeholder="User Age"><br>
            <input type="text" name="emailId" required placeholder="Email ID"><br>
            <input type="password" name="password" required placeholder="Password"><br>
            <input type="submit" value="Register" style="margin-right: 40px"><a style="font-size: 30px;" href="login.jsp">Login</a><br>
            <c:if test = "${not empty message}">
                <p>${message}</p>
            </c:if>
        </form>
    </div>
</div>
<%
    session.setAttribute("message",null);
%>
</body>
</html>
