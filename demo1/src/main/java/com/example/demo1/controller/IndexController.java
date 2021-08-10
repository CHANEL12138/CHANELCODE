package com.example.demo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.bean.Admin;
import com.example.demo1.service.impl.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    AdminServiceImp adminServiceImp;

    @GetMapping({"/","/login"})
    public String loginPage()
    {
        return "login";
    }


    @PostMapping("/login")
    public String main(Admin user, HttpSession session, Model model)
    {
        Admin ad = adminServiceImp.getOne(new QueryWrapper<Admin>().eq("username", user.getUsername()));
        if(ad==null)
        {
            session.setAttribute("msg","用户名密码错误");
            return "login";
        }
        else if(ad.getPassword().equals(user.getPassword()))
        {
            session.setAttribute("LoginUser",user);
            return "redirect:/main.html";
        }
        model.addAttribute("msg","用户名密码错误");
        return "login";

    }


    @GetMapping("/main.html")
    public String mainPage()
    {
        return "index";
    }


    @GetMapping("/common")
    public String common()
    {
        return "common";
    }



}
