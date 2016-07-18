package com.bjsxt.service;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.impl.UserDAOImpl;
import com.bjsxt.model.Log;
import com.bjsxt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Mark on 2016/6/29.
 */
@Component
public class Userservice {

    private UserDAO userDAO;

    private LogDAO logDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name = "UserDAOImpl")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public LogDAO getLogDAO() {
        return logDAO;
    }

    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }

    @Transactional
    public void add(User u) {
        userDAO.save(u);
        Log log = new Log();
        log.setMessage("a user saved!");
        logDAO.save(log);
    }
}
