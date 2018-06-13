package com.dy.myboot.controller;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.dy.myboot.core.beans.Method;
import com.dy.myboot.core.sql.where.C;
import com.dy.myboot.dao.UserDao;
import com.dy.myboot.dao.UserDaoInterface;
import com.dy.myboot.model.User;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserDao userDao;

    @Resource
    private UserDaoInterface userDaoInterface;

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

    @Transactional
    @ResponseBody
    @PostMapping("add")
    public Integer add(User user) {
        userDaoInterface.insert(user);
        String a = null;
        a.indexOf('c');//自动回滚，user添加失败
        return user.getId().intValue();
    }
}
