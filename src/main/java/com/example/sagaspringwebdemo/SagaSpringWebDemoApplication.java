package com.example.sagaspringwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SagaSpringWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagaSpringWebDemoApplication.class, args);
	}

	@GetMapping(value = "/hi")
	public String hi() {
		return "Hi Spring...";
	}
}
