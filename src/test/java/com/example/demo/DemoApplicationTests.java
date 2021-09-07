package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.UserPO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        UserPO userPO = userDao.selectById(1);
        System.out.println(userPO);
    }

}
