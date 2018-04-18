package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserMapper;
import com.demo.domain.User;

@RestController
public class UserController {
    //依赖注入
    @Resource
    UserMapper userMapper;

    @RequestMapping(value = "getUser/{name}",method = RequestMethod.GET)
    public User getUser(@PathVariable String name) {
        //调用dao层
        User user = userMapper.selectUserByName(name);
        return user;
    }
}

