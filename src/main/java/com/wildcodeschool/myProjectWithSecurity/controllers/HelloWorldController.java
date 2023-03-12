package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String home() {
        return "Hello world !";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello user !";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello admin !";
    }
}
