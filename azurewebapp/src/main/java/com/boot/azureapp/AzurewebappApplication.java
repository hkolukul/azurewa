package com.boot.azureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzurewebappApplication extends SpringBootServletInitializer {
	
	@ResponseBody
	@GetMapping("/message")
	String getMessage() {
		return "Hello hari.. welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzurewebappApplication.class, args);
	}

}
