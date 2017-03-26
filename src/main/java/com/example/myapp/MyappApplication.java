package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
	
	@RequestMapping
	public String welcome(){
		return "App Backend 1.0";
	}

	@RequestMapping("/{name}")
	public String welcome(@PathVariable("name") String name){
		return "Welcome [ "+name+" ]...";
	}
	
}
