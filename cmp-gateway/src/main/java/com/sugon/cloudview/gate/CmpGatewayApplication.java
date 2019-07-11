package com.sugon.cloudview.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringCloudApplication
public class CmpGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmpGatewayApplication.class, args);
    }

}
