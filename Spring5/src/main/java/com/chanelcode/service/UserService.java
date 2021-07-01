package com.chanelcode.service;

import com.chanelcode.dao.UserDao;
import com.chanelcode.dao.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class UserService {


//    如果有多个实现类，就用    @Qualifier("userDaoImp") 来指定到底实现那个实现类 根据名称注入
    @Autowired//根据类型注入
    @Qualifier("userDaoImp")
    private UserDao userDao;

    @Value("Haddd")
    private String name;

    @Value("16540")
    private Integer id;

    public void add()
    {
        System.out.println(name);
        id+=id;
        System.out.println(id);
        userDao.add();
        System.out.println("Server starts.....");
    }

}
