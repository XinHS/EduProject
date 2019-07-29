package com.xin.edu.web.controller;


import com.xin.edu.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public String login(){
        System.out.println("测试。。。。");
        return null;
    }
}
