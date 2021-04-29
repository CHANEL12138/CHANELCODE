
/*
五。Http请求协议包内部空间：【背】

     1.按照自上而下划分，分为4个空间

     2.空间划分:

                请求行：[
		            url:请求地址（http://192.168.100.2:8080/index.html）
		            method:请求方式（POST/GET）
		         ]

                请求头：[

		              请求参数信息【GET】
		         ]

                空白行：[
		                没有任何内容，起到隔离作用

		         ]

                 请求体:[

		             请求参数信息【POST】
		          ]

六。Http响应协议包内部结构 【背】
          1.按照自上而下划分，分为4个空间
	  2.空间划分:
	             状态行：[
		                  Http状态码

		              ]

                     响应头：[
		                  content-type: 指定浏览器采用对应编译器
				                对响应体二进制数据进行解析

		              ]

                     空白行：[
		                  没有任何内容，起到隔离作用

		              ]
                     响应体：[
		                 可能被访问静态资源文件内容
				 可能被访问的静态资源文件命令
				 可能被访问的动态资源文件运行结果
		                  *****都是以二进制形式***
		              ]
 */

package com.chanelproject.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class OneServlet extends HttpServlet {

    public OneServlet() {
        System.out.println("One Servlet Cons!!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("One DoGet!!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("One DoPost!!!!");
    }
}
