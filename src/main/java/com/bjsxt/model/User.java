package com.bjsxt.model;

import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2016/6/29.
 */
@Component
public class User {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String username;
    private String password;

}
