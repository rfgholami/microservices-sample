package com.rfgholami.samples.microservices.sayinghello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SayingHelloService {

	public static void main(String[] args) {
		SpringApplication.run(SayingHelloService.class, args);
	}
}
