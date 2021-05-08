package com.chanelcode.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class FiveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Five Servlet Runs!");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/six");//这里只能写本地资源文件 不像sendRedirect可以写其他网站的名称，
        // 这种方式浏览器只需要发一次请求，剩下的是servlet和服务器之间的事情
        dispatcher.forward(request,response);

    }

}
