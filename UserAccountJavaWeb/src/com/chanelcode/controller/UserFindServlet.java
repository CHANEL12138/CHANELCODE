package com.chanelcode.controller;

import com.chanelcode.UserDAO.UserDao;
import com.chanelcode.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserFindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> ls = new UserDao().find();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<table align=\"center\" border=\"2\">\n" +
                "  <tr>\n" +
                "    <td>用户编号</td>\n" +
                "    <td>用户姓名</td> \n" +
                "    <td>用户密码</td>\n" +
                "    <td>用户性别</td>\n" +
                "    <td>用户邮箱</td>\n" +
                "    <td>操作</td>\n"+
                "  </tr>\n");

        for (User users:ls
             ) {
            out.print("<tr>");
            out.print("<td>"+ users.getUserID()+"</td>");
            out.print("<td>"+ users.getUsername()+"</td>");
            out.print("<td>"+ "*************"+"</td>");
            out.print("<td>"+ users.getSex()+"</td>");
            out.print("<td>"+ users.getEmail()+"</td>");
            out.print("<td>"+ "<a href='delete?UserID="+users.getUserID()+"'>删除用户</a>"+"</td>");
            out.print("</tr>");
        }


        out.print("</table>");
    }
}
