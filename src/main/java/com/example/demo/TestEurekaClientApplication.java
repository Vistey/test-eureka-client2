package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 第二个test-eureka-client 用于服务容错测试
 */

@EnableEurekaClient
@SpringBootApplication
public class TestEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaClientApplication.class, args);
	}
}
