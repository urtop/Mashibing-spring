package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.impl.UserDAOImpl;
import com.bjsxt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Mark on 2016/6/29.
 */
@Component
public class Userservice {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name="UserDAOImpl")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User u) {
        this.userDAO.save(u);
    }
}
