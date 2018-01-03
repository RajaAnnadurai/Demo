package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
}

@RestController
class MyRestController{
	@RequestMapping("/JenkinsVersion")
	public String sayHello(){
		return "V2";
	}
}
