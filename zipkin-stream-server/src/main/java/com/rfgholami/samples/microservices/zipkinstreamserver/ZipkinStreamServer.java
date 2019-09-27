package com.rfgholami.samples.microservices.zipkinstreamserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class ZipkinStreamServer {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinStreamServer.class, args);
    }

}


