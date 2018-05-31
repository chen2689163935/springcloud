package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建一个服务提供者
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping("home")
    public String home(@RequestParam String name){
        return "打印一段话---------------姓名: "+name+" port:"+ port;
    }

}
