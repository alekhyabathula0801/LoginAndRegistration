package com.loginandregistration.controller;

import com.loginandregistration.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        if(new UserDAO().check(emailId,password)) {
            session.setAttribute("emailId",emailId);
            response.sendRedirect("welcome.jsp");
        } else {
            session.setAttribute("message","Data Not Found..click on Registration");
            response.sendRedirect("login.jsp");
        }
    }

}
