package com.rfgholami.samples.microservices.callhelloservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/")
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private HelloService service;


    @GetMapping("/")
    public String health() {
        return "I am Ok";
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/first-hello")
    public String firstHello() {
        String hello = loadBalancer.choose("first-hello-service").getUri().toString();
        String answer = this.restTemplate.getForObject("http://first-hello-service/hello", String.class);
        return "Server Response :: " + answer + " :: " + hello;
    }


    @GetMapping("/second-hello")
    public String secondHello() {

        String response = restTemplate.exchange("http://second-hello-service/hello", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }).getBody();

        return "Server Response :: " + response;
    }


    @GetMapping("/random-hello")
    public String randomHello() {

        return service.randomHello();
    }


}
