package com.example.springbootjenkinsex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsExApplication.class, args);
    }

    @GetMapping
    public String getMessage(){
        return "Hello Kris!";
    }
}
