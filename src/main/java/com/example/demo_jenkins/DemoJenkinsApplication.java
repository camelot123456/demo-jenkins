package com.example.demo_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class DemoJenkinsApplication {

	@PostConstruct
	public void init() {
		log.info("Application Started...");
	}

	public static void main(String[] args) {
		log.info("Application executed...");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
