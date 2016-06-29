package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/**
 * Created by Mark on 2016/6/29.
 */
public class UserDAOImpl implements UserDAO {
    public void save(User U) {
        System.out.println("User Saved!");
    }
}
