package com.loginandregistration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        UserDAO userDAO = new UserDAO();
        if(userDAO.check(userId,password)) {
            session.setAttribute("userId",userId);
            session.setAttribute("password",password);
            response.sendRedirect("welcome.jsp");
        } else {
            session.setAttribute("message","Data Not Found..click on Registration");
            response.sendRedirect("login.jsp");
        }
    }

}
