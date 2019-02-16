package com.rfgholami.samples.microservices.callhelloservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Environment environment;

    @Value("${my-property}")
    private String property;

    @GetMapping("/")
    public String health() {
        return "I am Ok";
    }

    @GetMapping("/hello")
    public String backend() {

        String serverPort = environment.getProperty("local.server.port");


        return "Hello form Host Port : " + serverPort + " with property: " + property;
    }
}
