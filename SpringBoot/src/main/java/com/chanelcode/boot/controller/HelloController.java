package com.chanelcode.boot.controller;


import com.chanelcode.boot.bean.Car;
import com.chanelcode.boot.bean.Pet;
import com.chanelcode.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 或者 @RestController

@Controller
public class HelloController {


    @Autowired
    Car car;

    @Autowired
    Pet pet;

    @ResponseBody
    @RequestMapping("/car")
    public Car car()
    {
        return car;
    }

    @RequestMapping("/pet")
    public Pet pet()
    {
        return pet;
    }


    @ResponseBody
    @RequestMapping("/hello")
    public String handler01()
    {
        return "Hello SpringBoot2";
    }
}
