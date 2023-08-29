package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.app.rest.Customer;

@SpringBootApplication
public class RestTemplateDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateDeployApplication.class, args);
		
		String url="https://welcomerestapi-22f34a4060cc.herokuapp.com/";
		RestTemplate rt=new RestTemplate();
		String body = rt.getForEntity(url, String.class).getBody();
		System.out.println(body);
		
		String url2="https://restclientpostrequest-307f2c6d3e75.herokuapp.com/customer";
		RestTemplate rt1=new RestTemplate();
		Customer c=new Customer();
		c.setId(101);
		c.setName("Gunji Ashok");
		c.setPrice(225.00);
		ResponseEntity<String> postForEntity = rt1.postForEntity(url2, c, String.class);
	     String body2 = postForEntity.getBody();
	     System.out.println(body2);
	}

}
