package com.zmj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloAApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAApplication.class, args);
	}
}
