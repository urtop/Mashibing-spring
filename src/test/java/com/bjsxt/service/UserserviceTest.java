package com.bjsxt.service;

import com.bjsxt.model.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Mark on 2016/6/29.
 */
public class UserserviceTest {

    @org.junit.Test
    public void add() throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Userservice userservice = (Userservice) beanFactory.getBean("userservice");
        userservice.add(new User());
    }

    @Test
    public void testProxy() {
//        UserDAO userDAO = new UserDAOImpl();
//        LogInterceptor logInterceptor = new LogInterceptor();
//        UserDAO userDaoProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[]{UserDAO.class}, logInterceptor);
//        System.out.println(userDaoProxy.getClass().getName());
//        userDaoProxy.save(new User());
//        userDaoProxy.delete(new User());
    }
}