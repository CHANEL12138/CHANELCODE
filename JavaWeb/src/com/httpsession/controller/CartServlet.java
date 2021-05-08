package com.httpsession.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Enumeration<String> name = session.getAttributeNames();
        while(name.hasMoreElements())
        {
            String Name = name.nextElement();
            int number = (int) session.getAttribute(Name);
            System.out.println(Name+" "+number);
        }

    }
}
