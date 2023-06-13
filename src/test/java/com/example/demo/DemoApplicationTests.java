package com.example.demo;

import com.example.demo.domain.Consumer;
import com.example.demo.service.impl.ConsumerServiceImpl;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ConsumerServiceImpl consumerService;

    /*@Test
    void contextLoads() {
    }
    */

    //用户
    @Test
    public void consumerTest() {

        Consumer consumer = new Consumer();
        consumer.setUsername("test");
        consumer.setPassword("123");
        consumer.setSex(new Byte("0"));
        consumer.setPhoneNum("15666412227");
        consumer.setEmail("1239619@qq.com");
        consumer.setBirth(new Date());
        consumer.setIntroduction("");
        consumer.setLocation("");
        consumer.setAvator("/img/avatorImages/user.jpg");
        consumer.setCreateTime(new Date());
        consumer.setUpdateTime(new Date());
        consumerService.addUser(consumer);
    }

}
