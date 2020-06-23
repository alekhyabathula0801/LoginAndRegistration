package com.loginandregistration.controller;

import com.loginandregistration.dao.UserDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("userName");
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        int userAge = Integer.parseInt(request.getParameter("userAge"));
        HttpSession session = request.getSession();
        if (new UserDAO().addUserToDataBase(userName,password,userAge,emailId)){
            session.setAttribute("message","Registration Successfull...Login to continue");
            response.sendRedirect("login.jsp");
        } else {
            session.setAttribute("message","Email Id exists");
            response.sendRedirect("register.jsp");
        }
    }

}
