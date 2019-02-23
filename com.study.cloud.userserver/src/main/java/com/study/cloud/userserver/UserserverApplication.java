package com.study.cloud.userserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients
public class UserserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserverApplication.class, args);
    }

}
