package com.bjsxt.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2016/6/29.
 */
@Component("UserDAOImpl")
public class UserDAOImpl extends SuperDAO implements UserDAO {

    public void delete(User U) {
        System.out.println("User Deleted!");
    }

    public void find(int id) {
    }

    public void save(User U) {
        U.setName("Tao Li");
        this.getHibernateTemplate().save(U);
        System.out.println("User Saved!");
    }
}
