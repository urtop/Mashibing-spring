package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/**
 * Created by Mark on 2016/6/29.
 */
public class UserDAOImpl implements UserDAO {
    private String daoID;

    public void save(User U) {
        System.out.println("User Saved!");
    }

    public void delete(User U) {
        System.out.println("User Deleted!");
    }

    public void setDaoID(String daoID) {
        this.daoID = daoID;
    }

    @Override
    public String toString() {
        return daoID;
    }

    public String getDaoID() {
        return daoID;
    }

}
