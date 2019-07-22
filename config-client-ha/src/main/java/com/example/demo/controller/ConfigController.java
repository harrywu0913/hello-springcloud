package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${foo.hello}")
    private String foo_hello;

    @Value("${bar.hello}")
    private String bar_hello;

    @GetMapping("/hello")
    public String profile() {
        return this.foo_hello + " --> " + this.bar_hello;
    }

}