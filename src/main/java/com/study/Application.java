package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class Application {
    
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "hello springboot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
