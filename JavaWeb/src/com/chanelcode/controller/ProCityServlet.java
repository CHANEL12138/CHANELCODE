package com.chanelcode.controller;

import com.chanelcode.dao.CityDao;
import com.chanelcode.entity.City;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        CityDao cityDao = new CityDao();
        List<City> cities = cityDao.queryCities(Integer.valueOf(id));


        ObjectMapper op = new ObjectMapper();
        String s = op.writeValueAsString(cities);


        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(s);


    }

}
