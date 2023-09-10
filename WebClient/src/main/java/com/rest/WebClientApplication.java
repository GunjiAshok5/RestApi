package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
		
		WebClient client = WebClient.create();
		String url="https://restclientpostrequest-307f2c6d3e75.herokuapp.com/customer";
		Customer c=new Customer();
		c.setId(101);
		c.setName("Gunji Ashok");
		c.setPrice(500.00);
		 String block = client.post().
				uri(url).
				bodyValue(c).
				retrieve().
				bodyToMono(String.class).
				block();
		System.out.println(block);
		
		String url2="https://welcomerestapi-22f34a4060cc.herokuapp.com/";
		String block2 = WebClient.create().get().uri(url2)
				.retrieve().bodyToMono(String.class).block();
		 System.out.println(block2);
		
	}

}
