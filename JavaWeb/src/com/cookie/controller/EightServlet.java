package com.cookie.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class EightServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();






        String food = request.getParameter("food");
        int money = switch (food) {
            case "饺子" -> 30;
            case "面条" -> 20;
            case "盖饭" -> 15;
            default -> 0;
        };
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            out.print("<h1>没有开卡记录</h1>");
            return;
        }
        String username = "";
        Integer moneyN = null;
        for(Cookie card:cookies) {
            if (card.getName().equals("username"))
            {
                username = card.getValue();
            }
            if (card.getName().equals("money"))
            {
                moneyN = Integer.valueOf(card.getValue());
            }
        }


        int balance;
        if(moneyN>=money)
        {
            out.print("<h1>订餐成功</h1>");
            balance = moneyN-money;
            Cookie newCard = new Cookie("money",balance+"");
            response.addCookie(newCard);
            out.print(username+" 您本次吃的是 "+food+" 消费了 "+money+" 元，余额为 "+balance+" 元");


        }
        else{
            out.print("<h1>钱不够，订餐失败</h1>");
        }




    }

}
