package com.chanelcode.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class User {



    public void add()
    {
        System.out.println("add......");
    }



}
