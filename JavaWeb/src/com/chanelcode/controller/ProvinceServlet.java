package com.chanelcode.controller;

import com.chanelcode.dao.ProvinceDao;
import com.chanelcode.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProvinceServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String id = request.getParameter("id");
        ProvinceDao provinceDao = new ProvinceDao();
////        String s = provinceDao.queryProById(Integer.valueOf(id));
////        response.setContentType("text/html;charset=utf-8");
////        PrintWriter writer = response.getWriter();
////        writer.print(s);
//
//        Province province = provinceDao.queryOneProById(Integer.valueOf(id));
//        ObjectMapper op = new ObjectMapper();
//        String s = op.writeValueAsString(province);
//
//        response.setContentType("application/json;charset=utf-8");
//        PrintWriter writer = response.getWriter();
//        writer.print(s);

        List<Province> provinces = provinceDao.queryProvinces();
        ObjectMapper op = new ObjectMapper();
        String s = op.writeValueAsString(provinces);


        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(s);

    }

}
