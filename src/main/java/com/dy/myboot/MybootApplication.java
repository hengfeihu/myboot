package com.dy.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan({"com.dy.myboot.dao", "com.dy.myboot"})
public class MybootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybootApplication.class, args);
    }
}
