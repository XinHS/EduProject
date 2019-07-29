package com.xin.edu.service.impl;

import com.xin.edu.model.User;
import com.xin.edu.service.base.BaseServiceImlp;
import com.xin.edu.service.base.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImlp<User> implements UserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUId(String id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUId(String id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }

}
