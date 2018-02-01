package com.spring.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RefreshScope
public class Application {
	
	 @Value("${lucky-word}")
	  String name;

	  @RequestMapping("/chk")
	  public String home() {
	    return "Hello " + name;
	  }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
