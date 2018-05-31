package com.example.serviceribbon.service.impl;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://serviceClient/home?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi"+name+" sorry! -服务器出现故障！";
    }


}
