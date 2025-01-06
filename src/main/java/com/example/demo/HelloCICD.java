package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloCICD {
    public static void main(String[] args) {
        SpringApplication.run(HelloCICD.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/")
        public String sayHello() {
            return "Hello CI/CD";
        }
    }
}
