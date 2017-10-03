package com.grisel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class ToReadApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ToReadApiApplication.class, args);
	}
}
