package com.mundoaquarismo.mundoaquarismo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.mundoaquarismo.mundoaquarismo.Models"})
public class MundoaquarismoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundoaquarismoApplication.class, args);
	}



}
