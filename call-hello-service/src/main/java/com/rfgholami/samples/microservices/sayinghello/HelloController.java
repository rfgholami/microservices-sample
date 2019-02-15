package com.rfgholami.samples.microservices.sayinghello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class HelloController {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private LoadBalancerClient loadBalancer;

	@GetMapping("/hello")
	public String hi() {

		String s = loadBalancer.choose("saying-hello-service").getUri().toString();


		String randomString = this.restTemplate.getForObject("http://saying-hello-service/hello", String.class);
		return "Server Response :: " + randomString+" :: "+s;
	}
}
