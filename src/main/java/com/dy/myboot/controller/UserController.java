package com.dy.myboot.controller;

import com.dy.myboot.core.beans.Method;
import com.dy.myboot.core.sql.where.C;
import com.dy.myboot.dao.UserDao;
import com.dy.myboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserDao userDao;

    @ResponseBody
    @GetMapping("all")
    public List<User> all() {
        return userDao.list(Method.where("userName", C.LIKE, "hu"));
    }

    @ResponseBody
    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id) {
        return userDao.get(id);
    }
}
