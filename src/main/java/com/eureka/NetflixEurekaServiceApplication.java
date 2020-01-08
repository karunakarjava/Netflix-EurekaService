package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServiceApplication.class, args);
	}

}
