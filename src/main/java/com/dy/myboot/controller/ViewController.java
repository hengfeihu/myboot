package com.dy.myboot.controller;

import com.dy.myboot.dao.UserMapper;
import com.dy.myboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @GetMapping("/test1")
    public String testTransaction1() {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = transactionManager.getTransaction(def);
        User user = null;
        try {
            user = new User();
            user.setUsername("xx");
            user.setPassword("ppp");
            user.setPhone("2321312");
            userMapper.insert(user);
            String a = null;
            a.indexOf("b");
            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
        return user.toString();
    }

    @Transactional
    @ResponseBody
    @GetMapping("/test2")
    public String testTransaction2() {
        User user = null;
        try {
            user = new User();
            user.setUsername("xx");
            user.setPassword("ppp");
            user.setPhone("2321312");
            userMapper.insert(user);
            String a = null;
            a.indexOf("b");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user.toString();
    }
}
