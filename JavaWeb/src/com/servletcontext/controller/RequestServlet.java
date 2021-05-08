package com.servletcontext.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = request.getServletContext();
        String a = (String)application.getAttribute("data1");
        System.out.println(a);
    }
}
