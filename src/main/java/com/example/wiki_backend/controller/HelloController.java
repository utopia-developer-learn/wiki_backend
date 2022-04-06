package com.example.wiki_backend.controller;

import com.example.wiki_backend.entity.TestEntity;
import com.example.wiki_backend.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author utopia
 */
@RestController
public class HelloController {
    @Resource
    private TestService testService;


    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/test/list")
    public List<TestEntity> list(){
        return testService.list();
    }
}
