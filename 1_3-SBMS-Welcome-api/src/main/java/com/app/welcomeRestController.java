package com.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return "Welcome to Spring Boot Microservices!";
    }
}
