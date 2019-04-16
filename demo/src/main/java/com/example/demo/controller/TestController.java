package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("test")
public class TestController{
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("test")
    public void send(){
//       redisTemplate.opsForValue().set("wds","AAAAAAAAAAAAAA");
//        ValueOperations<Serializable,String> valueOperations = redisTemplate.opsForValue();
        System.out.println(redisTemplate.opsForValue().get("wds"));
    }
}
