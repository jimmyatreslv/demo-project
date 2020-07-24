package com.example.demoproject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String greeting() {
        return "hello home @" + appVersion;
    }
}