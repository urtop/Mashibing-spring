package com.bjsxt.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public  void com.bjsxt.service.Userservice.add(com.bjsxt.model.User) )")
    public void myMethod(){};

    @Before("myMethod()")
    public void before() {
        System.out.println("AOP start!");
    }

    @AfterThrowing("myMethod()")
    public void afterThrowing(){
        System.out.print("After Throwing!!!");
    }

}


