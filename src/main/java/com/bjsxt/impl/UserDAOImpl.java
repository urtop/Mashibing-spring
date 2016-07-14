package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
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
    public void save(User U) {
        try {
            Connection connection = dataSource.getConnection();
            Random rand = new Random();
            int id  = 1 + rand.nextInt((100 ) + 1);
            connection.createStatement().executeUpdate("insert into user VALUES ("+id+",'Tao Li')");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("User Saved!");
//        throw new RuntimeException("Exception fot test!");
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
}
