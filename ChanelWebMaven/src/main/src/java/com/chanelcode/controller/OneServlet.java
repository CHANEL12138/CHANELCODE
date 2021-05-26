package com.chanelcode.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("OneServlet");

        response.setContentType("text/html;charset=utf-8");

        PrintWriter printWriter = response.getWriter();

        printWriter.print("<h1>好家伙！！</h1>");

    }

}
