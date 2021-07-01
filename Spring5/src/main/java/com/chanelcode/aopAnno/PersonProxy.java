package com.chanelcode.aopAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
//Order注解越小优先级越高
//先执行
public class PersonProxy {
    @Before("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void before()
    {
        System.out.println("Before Person.......");
    }
}
