package com.study.cloud.swaggerone;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableEurekaClient
public class SwaggeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggeroneApplication.class, args);
    }

}
