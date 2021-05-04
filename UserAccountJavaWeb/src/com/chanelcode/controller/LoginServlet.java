package com.chanelcode.controller;

import com.chanelcode.UserDAO.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");


        UserDao dao = new UserDao();
        int result = dao.login(Username,Password);

        if(result==1)
        {
            response.sendRedirect("index.html");
        }
        else
        {
            response.sendRedirect("login_error.html");
        }
    }
}
