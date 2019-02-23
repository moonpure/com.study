package com.study.cloud.daoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DaoserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaoserverApplication.class, args);
	}

}
