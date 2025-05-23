package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BloodesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodesApplication.class, args);
    }
}


class Request {

    public String handleRequest() {
        return "Request received successfully!";
    }
}