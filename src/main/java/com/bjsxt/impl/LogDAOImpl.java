package com.bjsxt.impl;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.model.Log;
import com.bjsxt.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by Mark on 2016/6/29.
 */
@Component("LogDAOImpl")
public class LogDAOImpl implements LogDAO {


    private DataSource dataSource;
    private SessionFactory sessionFactory;

    public void save(Log log) {
        Session s = sessionFactory.getCurrentSession();
        s.save(log);
        System.out.println("Log Saved!");
    }


    public DataSource getDataSource() {
        return dataSource;
    }

    @Resource
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}