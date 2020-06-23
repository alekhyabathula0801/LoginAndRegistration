package com.loginandregistration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/Registration")
public class InputValidator implements Filter {

    String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        int userAge = Integer.parseInt(request.getParameter("userAge"));
        String emailId = request.getParameter("emailId");
        if(emailId.matches(EMAIL_PATTERN)&&userAge>17) {
            chain.doFilter(req, resp);
        } else if(!emailId.matches(EMAIL_PATTERN) && userAge<18) {
            session.setAttribute("message","Invalid Email ID and Under Age");
            response.sendRedirect("register.jsp");
        } else if(!emailId.matches(EMAIL_PATTERN)) {
            session.setAttribute("message","Invalid Email ID");
            response.sendRedirect("register.jsp");
        } else if(userAge<0) {
            session.setAttribute("message","Invalid Age");
            response.sendRedirect("register.jsp");
        } else {
            session.setAttribute("message","UnderAge");
            response.sendRedirect("register.jsp");
        }
    }

}
