package com.viettel.vtnet.jaegerdemo.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final RestTemplate restTemplate;

    public HelloController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/hello")
    public String hello() {
        String response = restTemplate.getForObject("http://localhost:8081/ping", String.class);
        return "Hello + " + response;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
