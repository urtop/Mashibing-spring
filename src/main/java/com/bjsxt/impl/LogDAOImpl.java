package com.bjsxt.impl;

import com.bjsxt.dao.LogDAO;
import com.bjsxt.model.Log;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2016/6/29.
 */

@Component("LogDAOImpl")
public class LogDAOImpl extends SuperDAO implements LogDAO {

    public void save(Log log) {
        this.getHibernateTemplate().save(log);
        System.out.println("Log Saved!");
    }


}