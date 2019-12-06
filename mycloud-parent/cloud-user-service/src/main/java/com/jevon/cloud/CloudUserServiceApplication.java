package com.jevon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


@EnableEurekaClient
@SpringBootApplication
//@EnableAuthorizationServer
public class CloudUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudUserServiceApplication.class, args);
    }

}
