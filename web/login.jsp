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
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="login">
    <div class="form">
        <form action="Login" method="post">
            <h3>Login Page</h3><br>
            <input type="text" name="emailId" required placeholder="Email ID"> <br>
            <input type="password" name="password" required placeholder="Password"><br>
            <input type="submit" value="Login" style="margin-right: 40px"><a style="font-size: 30px;" href="register.jsp">Registration</a><br>
            <c:if test = "${not empty message}">
                <p> ${message} </p>
            </c:if>
        </form>
    </div>
</div>
<%
    session.setAttribute("message",null);
%>

</body>
</html>
