package com.example.demo1.controller;

import com.example.demo1.bean.User;
import com.example.demo1.mapper.CleanMapper;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserServiceImp userService;

    @Autowired
    CleanMapper cleanMapper;

    @GetMapping("/basic_table")
    public String basic_table(Model model)
    {
        List<User> list = userService.list();
        model.addAttribute("users",list);

        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table()
    {
        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table()
    {
        return "table/editable_table";
    }

    @GetMapping("/add")
    public String addTable()
    {
        return "table/add";
    }

//    @GetMapping("/update")
//    public String updateTable()
//    {
//        return "table/update";
//    }

    @GetMapping("/responsive_table")
    public String responsive_table()
    {
        return "table/responsive_table";
    }


    @PostMapping("/add")
    public String addUser(User user)
    {
        boolean save = userService.save(user);
        return "redirect:/basic_table";
    }

//    @GetMapping("/delete/${id}")
//    public String deleteUser(Integer id,Model model)
//    {
//        return "";
//    }

    @GetMapping("/update/{id}")
    public String UpdateUser(Model model,@PathVariable("id") Integer id,HttpSession session)
    {
        System.out.println(id);
        session.setAttribute("id",id);
        User byId = userService.getById(id);
        if(byId==null||id==null)return "redirect:/basic_table";
        model.addAttribute("id",byId.getId());
        model.addAttribute("name",byId.getName());
        model.addAttribute("age",byId.getAge());
        model.addAttribute("email",byId.getEmail());
        return "table/update";
    }

    @PostMapping("/execute")
    public String ExecuteUpdate(User user,HttpSession session)
    {
        Object id = session.getAttribute("id");
        user.setId((Integer) id);
        userService.updateById(user);
        return "redirect:/basic_table";
    }

    @GetMapping("/delete/{id}")
    public String Delete(@PathVariable("id")Integer id)
    {

        userService.removeById(id);
        return "redirect:/basic_table";
    }

    @GetMapping("/clean")
    public String Clean()
    {
        cleanMapper.Clean();
        return "redirect:/basic_table";
    }

}
