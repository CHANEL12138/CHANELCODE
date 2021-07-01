package com.chanelcode.dao;

import com.chanelcode.bean.Book;
import com.chanelcode.bean.UserAnno;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserDaoImp implements UserDao{




    @Override
    public void add() {
        System.out.println("UserDao add.....");
    }


}
