package com.rfgholami.samples.microservices.secondsayinghelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecondSayingHelloService {

	public static void main(String[] args) {
		SpringApplication.run(SecondSayingHelloService.class, args);
	}
}
