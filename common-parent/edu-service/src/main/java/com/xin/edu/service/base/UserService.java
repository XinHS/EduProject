package com.xin.edu.service.base;

import com.xin.edu.model.User;

public interface UserService extends IBaseService<User> {

    public User login(String username,String password);
}
