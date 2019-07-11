package com.sugon.cloudview.user.cmpuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*加了注解还要配置*/
@EnableEurekaClient
@SpringBootApplication
public class CmpUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmpUserApplication.class, args);
    }

}
