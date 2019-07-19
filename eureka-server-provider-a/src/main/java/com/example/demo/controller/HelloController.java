package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //restful api方式
    @GetMapping("/index/{name}")
    public String index(@PathVariable String name) {
        return "hello!" + name;
    }

    //restful api方式
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }

}