package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	@Bean
	public String message(){
		System.out.println("creating message bean");
		return "Hello world";
	}

	@Bean
	public String uppercaseMessage(messageService ms)
	{
		System.out.println("creating uppercase bean");
		return ms.uppercase();
	}

    @Bean
	public String lowercaseMessage(messageService ms)
	{
		System.out.println("creating lowercase bean");
		return ms.lowercase();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

}
