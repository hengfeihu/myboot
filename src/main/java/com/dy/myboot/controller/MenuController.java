package com.dy.myboot.controller;

import com.dy.myboot.model.Menu;
import com.dy.myboot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "system/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "tree", method = RequestMethod.GET)
    public List<Menu> tree() {
        return menuService.menuTree();
    }
}
