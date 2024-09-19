package com.springMICRO2.Microservice_WEb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceWEb2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWEb2Application.class, args);
	}

}
