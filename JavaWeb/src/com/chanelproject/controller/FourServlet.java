package com.chanelproject.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

public class FourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("****Console info");
        StringBuffer url = req.getRequestURL();
        String method = req.getMethod();
        String URI = req.getRequestURI();

        System.out.println(url+"\n"+method+"\n"+URI);


//        Enumeration<String> enum1 = req.getParameterNames();
//
//        while (enum1.hasMoreElements())
//        {
//            System.out.println(enum1.nextElement());
//        }
//        System.out.println(req.getParameterValues("username")[1]);//传多个参数username=123&username=1234
//
//        Map<String,String[]> map1 = req.getParameterMap();
//        Collection<String> keySet = map1.keySet();
//        for (String key:keySet
//             ) {
//            System.out.println(key+"="+map1.get(key)[0]);
//        }

        System.out.println(req.getParameter("get"));

        System.out.println("****Console info");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("****Console info");
        StringBuffer url = req.getRequestURL();
        String method = req.getMethod();
        String URI = req.getRequestURI();

        System.out.println(url+"\n"+method+"\n"+URI);



        //req.setCharacterEncoding("utf-8");
        System.out.println(req.getParameter("post"));


        System.out.println("****Console info");
    }
}
