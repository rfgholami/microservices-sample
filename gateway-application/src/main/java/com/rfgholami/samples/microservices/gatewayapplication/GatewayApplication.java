package com.rfgholami.samples.microservices.gatewayapplication;


import com.rfgholami.samples.microservices.gatewayapplication.filters.ErrorFilter;
import com.rfgholami.samples.microservices.gatewayapplication.filters.PostFilter;
import com.rfgholami.samples.microservices.gatewayapplication.filters.PreFilter;
import com.rfgholami.samples.microservices.gatewayapplication.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }


    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
