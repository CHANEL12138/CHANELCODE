package com.httpsession.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class HSServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");



        HttpSession session = request.getSession();
        //request.getSession(false);这个表示如果原来没有session对象是返回空，上面的话没有就创建一个session对象
        Integer Num = (Integer) session.getAttribute(name);
        if(Num==null)
        {
            session.setAttribute(name,1);
        }else
        {
            session.setAttribute(name,Num+1);
        }


    }
}
