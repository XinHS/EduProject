package com.xin.edu.web.controller;


import com.xin.edu.model.User;
import com.xin.edu.service.base.IBaseService;
import com.xin.edu.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("测试。。。。。。");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }
}
