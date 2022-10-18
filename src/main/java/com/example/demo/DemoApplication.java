package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.microsoft.applicationinsights.attach.ApplicationInsights;

@SpringBootApplication
@RestController
public class DemoApplication {

	
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		logger.info("Got called!");
		return "Azure deplyed!";
	}
}
