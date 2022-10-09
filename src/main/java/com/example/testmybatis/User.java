package com.example.testmybatis;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String username;
    private Integer age;
    private Date createTime;
}