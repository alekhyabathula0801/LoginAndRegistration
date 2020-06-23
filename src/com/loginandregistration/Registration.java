package com.loginandregistration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        UserDAO userDAO = new UserDAO();
        if (userDAO.addUserToDataBase(userName,userId,password)){
            session.setAttribute("message","Registration Successfull...Login to continue");
            response.sendRedirect("login.jsp");
        } else {
            session.setAttribute("message","User Id exists");
            response.sendRedirect("register.jsp");
        }
    }

}
