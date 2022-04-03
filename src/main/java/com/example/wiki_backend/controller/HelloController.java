package com.example.wiki_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author utopia
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }
}
