package com.dy.myboot.dao;

import com.dy.myboot.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    int insert(User record);

    List<User> selectUsers();

    @Select("select * from t_user where userId=#{id}")
    User getUserById(int id);

    List<User> sqlfindall(String sql);
}
