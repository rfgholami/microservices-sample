package com.rfgholami.samples.microservices.firsthelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstHelloService {

	public static void main(String[] args) {
		SpringApplication.run(FirstHelloService.class, args);
	}
}
