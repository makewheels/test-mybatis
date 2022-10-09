package com.example.testmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.testmybatis")
public class TestMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMybatisApplication.class, args);
    }

}
