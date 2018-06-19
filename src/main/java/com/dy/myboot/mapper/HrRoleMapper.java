package com.dy.myboot.mapper;

import com.dy.myboot.model.HrRole;
import java.util.List;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    List<HrRole> selectAll();

    int updateByPrimaryKey(HrRole record);
}