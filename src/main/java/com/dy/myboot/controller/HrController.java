package com.dy.myboot.controller;

import com.dy.myboot.mapper.HrMapper;
import com.dy.myboot.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/system/hr/")
public class HrController {

    @Autowired
    private HrMapper hrMapper;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<Hr> all() {
        return hrMapper.selectAll();
    }
}
