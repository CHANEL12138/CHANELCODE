package com.chanelproject.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
//HttpResponse接口
public class ThreeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = "JavaWeb Good!<br> Java-Coding Good!<br> <hr color = \"red\" ; width = \"100%\"></hr>";
        String s1 = "好家伙<br>坏家伙<br>真不错！<br>";
       //String s3 = "https://www.baidu.com";
        //int a = 60;


        resp.setContentType("text/html;charset=utf-8");
        //拿到字符流之前设置解析方式和字符集
        PrintWriter out = resp.getWriter();


        out.print(s);
        out.print(s1);

       // out.write(a);//write方法是将a以ascii码的形式写入

        //resp.sendRedirect(s3);//设置location值重定向至
    }
}
