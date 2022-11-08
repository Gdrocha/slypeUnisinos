package com.unisinos.Slype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:slype-spring.xml")
public class SlypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlypeApplication.class, args);
	}

}
