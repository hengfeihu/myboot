package com.dy.myboot.controller;

import com.dy.myboot.dao.UserMapper;
import com.dy.myboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<User> all() {
        return userMapper.selectAll();
    }
}
