package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/feign-consumer-index")
    public String indexConsumer() {
        return helloService.hello();
    }

    @GetMapping(value = "/feign-consumer-hello/{name}")
    public String helloConsumer(@PathVariable String name) {
        return helloService.index(name);
    }
}
