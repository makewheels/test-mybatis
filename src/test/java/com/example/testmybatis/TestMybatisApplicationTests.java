package com.example.testmybatis;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class TestMybatisApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername(RandomUtil.randomString(7));
        user.setAge(RandomUtil.randomInt(7));
        user.setCreateTime(new Date());
        userService.create(user);
    }

}
