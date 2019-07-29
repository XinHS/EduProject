package com.xin.edu.service.base;

import com.xin.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImlp<T> implements IBaseService<T> {
    //统一管理dao
    @Autowired //由spring自动注入
    protected UserMapper userMapper;
}
