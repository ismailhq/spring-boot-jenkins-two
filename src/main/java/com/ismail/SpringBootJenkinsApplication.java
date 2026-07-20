package com.ismail;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsApplication {
	
	private static Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("Test logging two from main method......");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		System.out.println("Inside greeting()=====>>>>");
		return "Greetings from jenkins demo project...after integration with docker hub and kubernetes...final testing done by ismail";
	}

}
