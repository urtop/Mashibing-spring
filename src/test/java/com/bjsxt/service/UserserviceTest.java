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

    }
}