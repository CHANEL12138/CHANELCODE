package com.chanelcode.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class BmiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String weight = request.getParameter("w");
        String height = request.getParameter("h");

        float h = Float.parseFloat(height);
        float w = Float.parseFloat(weight);
        float bmi = w/(h*h);


        String msg = "";
        if(bmi<=18.5) msg="您比较瘦";
        else if(bmi>18.5&&bmi<=23.9) msg="您的bmi是正常的";
        else if(bmi>24&&bmi<=27) msg="您的身体比较胖";
        else
            msg="您的身体肥胖";

        msg="您好："+name+" 先生/女士，您的bmi值是 "+bmi+" "+msg;

        System.out.println(msg);


        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(msg);

    }
}
