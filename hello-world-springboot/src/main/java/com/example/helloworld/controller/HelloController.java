package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController        // makes this class a REST controller
public class HelloController {

    @GetMapping("/hello")    // HTTP GET http://localhost:8080/
    public String hello() {
        return "Jai Shree Ram, World!";
    }
}
