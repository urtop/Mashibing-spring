package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    private DataSource dataSource;
    private SessionFactory sessionFactory;

    public void save(User U) {
        try {
            Session s = sessionFactory.openSession();
            s.beginTransaction();
            U.setName("Tao Li");
            s.save(U);
            s.getTransaction().commit();
//            Connection connection = dataSource.getConnection();
//            Random rand = new Random();
//            int id = 1 + rand.nextInt((100) + 1);
//            connection.createStatement().executeUpdate("insert into user VALUES (" + id + ",'Tao Li')");
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("User Saved!");
    }

    public void delete(User U) {
        System.out.println("User Deleted!");
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
