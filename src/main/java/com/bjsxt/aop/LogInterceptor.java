package com.bjsxt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {

    @Before("execution(public  void com.bjsxt.service.Userservice.add(com.bjsxt.model.User) )")
    public void before() {
        System.out.println("AOP start!");
    }

}


