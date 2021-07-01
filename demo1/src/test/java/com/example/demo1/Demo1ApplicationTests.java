package com.example.demo1;

import com.example.demo1.bean.User;
import com.example.demo1.mapper.UserMapper;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    UserMapper userMapper;


    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

}
