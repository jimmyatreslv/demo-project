package com.example.demoproject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public @ResponseBody String greeting_home() {
        return "Hello, World @" + appVersion;
    }

    @GetMapping("/hello")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
}