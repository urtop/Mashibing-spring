package com.bjsxt.service;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.impl.UserDAOImpl;
import com.bjsxt.model.User;
//import com.bjsxt.spring.BeanFactory;
//import com.bjsxt.spring.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Created by Mark on 2016/6/29.
 */
public class UserserviceTest {

    @org.junit.Test
    public void add() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Userservice userservice = (Userservice) beanFactory.getBean("userService");
        User u = new User();
        userservice.add(u);
    }

    @Test
    public void testProxy() {
        UserDAO userDAO = new UserDAOImpl();
        LogInterceptor logInterceptor = new LogInterceptor();
        logInterceptor.setTarget(userDAO);
        UserDAO userDaoProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[]{UserDAO.class}, logInterceptor);
        System.out.println(userDaoProxy.getClass().getName());
        userDaoProxy.save(new User());
        userDaoProxy.delete(new User());
    }
}