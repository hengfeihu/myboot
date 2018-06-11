package com.dy.myboot.service;

import com.dy.myboot.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

    User getUserByid(int id);

    List<User> sqlfindAll(String sql);
}
