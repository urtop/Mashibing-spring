package com.bjsxt.dao;

import com.bjsxt.model.User;

/**
 * Created by Mark on 2016/6/29.
 */
public interface UserDAO {
    void save(User U);
    void delete(User U);
}
