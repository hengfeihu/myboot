package com.dy.myboot.service.impl;

import com.dy.myboot.dao.UserDao;
import com.dy.myboot.model.User;
import com.dy.myboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userDao.selectUsers();
        PageInfo<User> result = new PageInfo<>(userDomains);
        return result;
    }

    @Override
    public User getUserByid(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> sqlfindAll(String sql) {
        return userDao.sqlfindall(sql);
    }
}
