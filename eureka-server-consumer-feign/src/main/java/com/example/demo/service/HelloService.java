package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @RequestMapping("hello")
    String hello();

    @RequestMapping("index")
    String index(@RequestParam(value = "name") String name);
}
