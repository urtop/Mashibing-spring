package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Mark on 2016/6/29.
 */
@Component("UserDAOImpl")
public class UserDAOImpl implements UserDAO {

    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;

    public void delete(User U) {
        System.out.println("User Deleted!");
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void save(User U) {
//        Session s = sessionFactory.getCurrentSession();
//        U.setName("Tao Li");
//        s.save(U);
        hibernateTemplate.save(U);
        System.out.println("User Saved!");
    }
}
