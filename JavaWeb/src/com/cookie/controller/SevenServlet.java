package com.cookie.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SevenServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String money = request.getParameter("money");

        Cookie usernameC = new Cookie("username",username);
        Cookie moneyC = new Cookie("money",money);
        response.addCookie(usernameC);
        response.addCookie(moneyC);


        request.getRequestDispatcher("/CookieTest02.html").forward(request,response);



    }
}
