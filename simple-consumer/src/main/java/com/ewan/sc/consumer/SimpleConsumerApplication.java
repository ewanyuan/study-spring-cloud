package com.ewan.sc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
public class SimpleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleConsumerApplication.class, args);
	}
}
