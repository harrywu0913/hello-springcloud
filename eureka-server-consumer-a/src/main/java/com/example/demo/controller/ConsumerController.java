package com.example.demo.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer-index")
    public String indexConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello/", String.class).getBody();
    }

    @GetMapping(value = "/ribbon-consumer-hello")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/index/{1}", String.class, "haha").getBody();
    }
}
