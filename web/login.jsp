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
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="login">
    <div class="form">
        <form action="Login" method="post">
            <h3>Login Page</h3><br>
            <p style="color: black; font-size: 20px">sample email pattern - char@char.com or char@char.com.in</p>
            <input type="text" name="emailId" required placeholder="Email ID" pattern="^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$"> <br>
            <p style="color: black; font-size: 20px">Password must contain atleast one capital letter, special character and number with minimum of 5 characters</p>
            <input type="password" name="password" required placeholder="Password" pattern="(?=.*[A-Z])(?=.*[^0-9a-zA-Z])(?=.*[0-9]).{5,}"><br>
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
