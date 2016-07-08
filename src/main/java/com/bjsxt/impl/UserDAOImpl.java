package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2016/6/29.
 */
@Component("UserDAOImpl")
public class UserDAOImpl implements UserDAO {

    public void save(User U) {
        System.out.println("User Saved!");
    }

    public void delete(User U) {
        System.out.println("User Deleted!");
    }


}
