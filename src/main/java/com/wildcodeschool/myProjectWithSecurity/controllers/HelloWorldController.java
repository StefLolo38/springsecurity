package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String user() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!!!";
    }

    @GetMapping("/avengers/assemble")
    public String steve() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String nick() {
        return "LYON, PARIS";
    }

}
