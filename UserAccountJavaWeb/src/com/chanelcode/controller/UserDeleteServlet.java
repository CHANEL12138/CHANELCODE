package com.chanelcode.controller;

import com.chanelcode.UserDAO.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Userid = request.getParameter("UserID");
        UserDao dao = new UserDao();
        int result = dao.delete(Userid);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(result == 1)
        {
            out.print("<h1>删除成功！！！！</h1><br>" +
                    "<a href='./find'>返回</a>");
        }
        else{
            out.print("<font style ='color = red;font-size=40'>用户信息删除失败！！</font>"
                    +"<a href='./find'>返回</a>");
        }



    }
}
