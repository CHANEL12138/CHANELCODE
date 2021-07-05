package com.chanelcode.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");


        request.setAttribute("name",name);
        request.setAttribute("age",age);
        request.setAttribute("email",email);

        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(age);
        list.add(email);
        request.setAttribute("list",list);
        System.out.println(list);
        request.getRequestDispatcher("/hello2.jsp").forward(request,response);



    }

}
