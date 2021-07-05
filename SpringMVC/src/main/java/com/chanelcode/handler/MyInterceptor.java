package com.chanelcode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//预处理方法：preHandle
//
//重要：是整个项目的入口，门户
//当preHandle返回true，请求可以被处理
//当preHandle返回false，请求到此方法就截止
//
//参数：Object handler：被拦截的控制器对象
//返回值：boolean
//
//true：请求通过拦截器验证，可以处理拦截器方法
//
//  控制台显示结果：
//      MyInterceptor拦截器的preHandle()方法执行了！
//      MyController控制器的doSome()方法执行！
//      MyInterceptor拦截器的postHandle()方法执行了！
//      MyInterceptor拦截器的afterCompletion()方法执行了！
//
//false：请求没有通过拦截器的验证，请求到达拦截器就截止了。请求没有被处理
//
//  控制台显示结果：
//      MyInterceptor拦截器的preHandle()方法执行了！
//
//特点：
//  1、该方法在控制器方法（MyController的doSome）之前执行，用户请求首先到达该方法
//  2、在该方法中可以获取请求的信息，验证请求是否符合要求。可以验证用户是否登录，验证用户是否有权访问某个连接地址（url），
//     如果验证失败，可以截断请求；如果验证成功，可以放行请求，此时控制器方法才能执行
//
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

}
