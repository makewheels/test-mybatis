package com.example.testmybatis;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int insert(User user);
}
