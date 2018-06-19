package com.dy.myboot.service;

import com.dy.myboot.common.HrUtils;
import com.dy.myboot.mapper.MenuMapper;
import com.dy.myboot.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenuService {
    @Autowired
    public MenuMapper menuMapper;

    public List<Menu> getAllMenu() {
        return menuMapper.selectAll();
    }

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(HrUtils.getCurrentHr().getId().longValue());
    }

    public List<Menu> menuTree() {
        return menuMapper.menuTree();
    }

    public List<Long> getMenusByRid(Long rid) {
        return menuMapper.getMenusByRid(rid);
    }
}
