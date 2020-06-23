package com.loginandregistration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/Registration")
public class AgeFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        int userAge = Integer.parseInt(request.getParameter("userAge"));
        HttpSession session = request.getSession();
        if(userAge<0) {
            session.setAttribute("message","Invalid Age");
            response.sendRedirect("register.jsp");
        } else if (userAge<18) {
            session.setAttribute("message","UnderAge");
            response.sendRedirect("register.jsp");
        } else
        chain.doFilter(req, resp);
    }

}
