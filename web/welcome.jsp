<%--
  Created by IntelliJ IDEA.
  User: arun kumar
  Date: 22-06-2020
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    if (session.getAttribute("emailId")==null)
        response.sendRedirect("login.jsp");
%>
<div class="welcome">
    <div class="form">
        <h4>Welcome</h4>
        <p>Have a nice day</p>
        <form action="Logout" method="post">
            <input type="submit" value="Logout">
        </form>
    </div>
</div>
</body>
</html>
