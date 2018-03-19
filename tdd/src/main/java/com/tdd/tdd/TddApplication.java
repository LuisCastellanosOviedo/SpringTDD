package com.tdd.tdd;

import com.tdd.tdd.restController.CalcRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TddApplication {


	@Autowired
	CalcRestController calcRestController;

	public static void main(String[] args) {
		SpringApplication.run(TddApplication.class, args);
	}
}
