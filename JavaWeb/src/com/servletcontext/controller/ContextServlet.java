package com.servletcontext.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data1 = "data from ContextServlet";
        ServletContext application = request.getServletContext();
        application.setAttribute("data1",data1);
    }

}
