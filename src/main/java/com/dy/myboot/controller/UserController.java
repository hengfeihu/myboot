package com.dy.myboot.controller;

import com.dy.myboot.model.User;
import com.dy.myboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("add")
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("all")
    public Object findAllUser(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                              @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        return userService.findAllUser(pageNum, pageSize);
    }

    @ResponseBody
    @GetMapping("{id}")
    public User getUserByid(@PathVariable(value = "id") int id) {
        return userService.getUserByid(id);
    }

    @ResponseBody
    @GetMapping("sqlfindall")
    public List<User> sqlfindAll() {
        return userService.sqlfindAll("select * from t_user");
    }
}
