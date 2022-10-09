package com.example.testmybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void create(User user) {
        int insert = userMapper.insert(user);
        log.info("insert: {}", insert);
    }

}
