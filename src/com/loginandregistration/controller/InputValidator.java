package com.loginandregistration.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/Registration")
public class InputValidator implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        int userAge = Integer.parseInt(request.getParameter("userAge"));
        if(userAge>17) {
            chain.doFilter(req, resp);
        } else if(userAge<0) {
            session.setAttribute("message","Invalid Age");
            response.sendRedirect("register.jsp");
        } else {
            session.setAttribute("message","UnderAge");
            response.sendRedirect("register.jsp");
        }
    }

}
