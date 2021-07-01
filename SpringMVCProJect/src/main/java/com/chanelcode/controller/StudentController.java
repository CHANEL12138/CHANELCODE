package com.chanelcode.controller;


import com.chanelcode.domain.Student;
import com.chanelcode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {


    @Autowired
    private StudentService service;



    @RequestMapping("/addStu")
    public ModelAndView addStu(Student student)
    {
        String tips = "添加成功";
        ModelAndView mv = new ModelAndView();
        int i = service.addStudent(student);
        if(i<0)
        {
            tips = "添加失败";
        }

        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/queryStu")
    @ResponseBody
    public List<Student> selectStu()
    {
        return service.findStudent();
    }

}
