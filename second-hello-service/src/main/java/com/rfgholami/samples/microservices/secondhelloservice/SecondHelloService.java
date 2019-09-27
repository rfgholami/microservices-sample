package com.rfgholami.samples.microservices.secondhelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecondHelloService {

	public static void main(String[] args) {
		SpringApplication.run(SecondHelloService.class, args);
	}
}
