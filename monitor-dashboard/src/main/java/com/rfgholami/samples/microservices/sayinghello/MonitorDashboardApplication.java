package com.rfgholami.samples.microservices.sayinghello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.net.ssl.HttpsURLConnection;

@SpringBootApplication
@Controller
@EnableHystrixDashboard
public class MonitorDashboardApplication extends SpringBootServletInitializer {



    private static final Logger LOG = LoggerFactory.getLogger(MonitorDashboardApplication.class);

    static {
        // for localhost testing only
        LOG.warn("Will now disable hostname check in SSL, only to be used during development");
//        HttpsURLConnection.setDefaultHostnameVerifier((hostname, sslSession) -> true);
    }

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MonitorDashboardApplication.class).web(WebApplicationType.SERVLET);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(MonitorDashboardApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}

