package com.rfgholami.samples.microservices.callhelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@RibbonClient(name = "first-hello-service", configuration = RibbonConfiguration.class)
public class CallHelloService {

    public static void main(String[] args) {
        SpringApplication.run(CallHelloService.class, args);
    }
}
