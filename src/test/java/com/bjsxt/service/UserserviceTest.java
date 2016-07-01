package com.bjsxt.service;

import com.bjsxt.model.User;
//import com.bjsxt.spring.BeanFactory;
//import com.bjsxt.spring.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mark on 2016/6/29.
 */
public class UserserviceTest {

    @org.junit.Test
    public void add() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Userservice userservice = (Userservice) beanFactory.getBean("userService");
//        UserDAO userDAO = (UserDAO) beanFactory.getBean("u");
//        userservice.setUserDAO(userDAO);
        User u = new User();
        userservice.add(u);

    }
}