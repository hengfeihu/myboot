package com.dy.myboot.mapper;

import com.dy.myboot.model.Hr;
import com.dy.myboot.model.Role;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    Hr selectByPrimaryKey(Integer id);

    List<Hr> selectAll();

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrId(Long id);
}