package com.dev.angular.RestuarentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EntityScan(basePackages = {"com.dev"})
public class RestuarentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestuarentServiceApplication.class, args);
		System.out.println("Started");
	}
}
