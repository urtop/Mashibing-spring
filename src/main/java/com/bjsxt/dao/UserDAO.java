package com.bjsxt.dao;

import com.bjsxt.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2016/6/29.
 */
@Component
public interface UserDAO {
    void save(User U);
    void delete(User U);
}
