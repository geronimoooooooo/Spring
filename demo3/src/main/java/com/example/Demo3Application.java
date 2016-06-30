package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"demo","controller"})
public class Demo3Application {
		
	@ResponseBody
	@RequestMapping("/")
	String entry2(){
		return "fuuuu";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
}
