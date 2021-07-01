package com.chanelcode.aopAnno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class UserProxy {
//相同接入点抽取
    @Pointcut("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void PointDemo() {}

//    before表示在方法前切入
    @Before("PointDemo()")
    public void before()
    {
        System.out.println("Before......");
    }

//    后置通知
    @After("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void after()
    {
        System.out.println("After.......");
    }

//    返回了之后才会通知
    @AfterReturning("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void afterReturning()
    {
        System.out.println("afterReturning........");
    }

//抛出异常之后通知
    @AfterThrowing("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void AfterThrowing()
    {
        System.out.println("AfterThrowing........");
    }

//环绕通知
    @Around("execution(* com.chanelcode.aopAnno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕之前。。。。。");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后。。。。。");
    }
}
