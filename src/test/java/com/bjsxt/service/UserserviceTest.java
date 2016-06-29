package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import com.bjsxt.spring.BeanFactory;
import com.bjsxt.spring.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Mark on 2016/6/29.
 */
public class UserserviceTest {

    @org.junit.Test
    public void add() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext();
        Userservice userservice = new Userservice();
        UserDAO userDAO = (UserDAO) beanFactory.getBean("u");
        userservice.setUserDAO(userDAO);
        User u = new User();
        userservice.add(u);

    }
}