package com.chanelcode.controller;

import com.chanelcode.UserDAO.UserDao;
import com.chanelcode.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class UserAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");

        int result = 0;
        User user = new User(null,Username,Password,sex,email);
        UserDao dao = new UserDao();
        result = dao.add(user);



        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(result == 1)
        {
            out.print("<h1>注册成功！！！！</h1><br>" +
                    "<a href='../user_add.html'>返回继续添加</a>");
        }
        else{
            out.print("<font style ='color = red;font-size=40'>用户信息注册失败！！</font>"
            +"<a href='../user_add.html'>返回继续添加</a>");
        }



    }
}
