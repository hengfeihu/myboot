package com.dy.myboot.controller;

import com.dy.myboot.dao.UserMapper;
import com.dy.myboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @ResponseBody
    @GetMapping("/")
    public String index() {
        User user = new User();
        user.setUsername("xx");
        user.setPassword("ppp");
        user.setPhone("2321312");
        userMapper.insert(user);
        String a = null;
        a.indexOf("b");
        return user.toString();
    }
}
