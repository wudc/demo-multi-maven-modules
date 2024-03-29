package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.demo"})
@EntityScan(basePackages= {"com.demo"})
@ComponentScan(basePackages= {"com.demo"})
public class WebApplication {

	public static void main(String args[]) {
		SpringApplication.run(WebApplication.class);
	}
}
