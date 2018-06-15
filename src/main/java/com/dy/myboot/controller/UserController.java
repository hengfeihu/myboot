package com.dy.myboot.controller;

import com.dy.myboot.dao.UserMapper;
import com.dy.myboot.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public PageInfo<User> all(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                              @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userMapper.selectAll();
        return new PageInfo<>(userDomains);
    }
}
