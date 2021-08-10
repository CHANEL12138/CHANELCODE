package com.example.demo1.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        Object loginUser = session.getAttribute("LoginUser");

        if(loginUser!=null)return true;



        session.setAttribute("msg","请先登录");
        response.sendRedirect("/");
        return false;

    }

}
