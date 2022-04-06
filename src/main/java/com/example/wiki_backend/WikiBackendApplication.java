package com.example.wiki_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author utopia
 */
@SpringBootApplication
@MapperScan("com.example.wiki_backend.mapper")
public class WikiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiBackendApplication.class, args);
    }

}
