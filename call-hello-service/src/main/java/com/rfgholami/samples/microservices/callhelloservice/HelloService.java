package com.rfgholami.samples.microservices.callhelloservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;


@Service
public class HelloService {


    @HystrixCommand(fallbackMethod = "defaultRandomHello")
    public String randomHello() {

        if ((int) (Math.random() * 2) == 0) {
            throw new RuntimeException("failed");
        }


        return "randomHello";
    }


    public String defaultRandomHello() {
        return "Failed Random Hello";
    }
}
