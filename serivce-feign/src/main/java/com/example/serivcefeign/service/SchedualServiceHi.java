package com.example.serivcefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  通过feignClient 来指定调用哪个服务，
 */
@FeignClient(value = "serviceClient")
public interface SchedualServiceHi {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String sayHiClientOne(@RequestParam(value = "name") String name);


}
