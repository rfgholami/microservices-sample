package com.rfgholami.samples.microservices.sayinghello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SayinghelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SayinghelloApplication.class, args);
    }

}

@RestController
@RequestMapping(value = "/")
class HelloController{

    @GetMapping(value = "hello")
    public String sayHello(){

        return "Hello";
    }

}

