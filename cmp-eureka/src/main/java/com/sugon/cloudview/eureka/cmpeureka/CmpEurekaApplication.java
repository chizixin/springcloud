package com.sugon.cloudview.eureka.cmpeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CmpEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmpEurekaApplication.class, args);
    }

}
