package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.impl.UserDAOImpl;
import com.bjsxt.model.User;

/**
 * Created by Mark on 2016/6/29.
 */
public class Userservice {

    private UserDAO userDAO = new UserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User u) {
        this.userDAO.save(u);
    }
}
