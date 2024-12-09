package com.project.franquicias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FranquiciasApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FranquiciasApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FranquiciasApplication.class, args);
		System.out.println("Funcionando Franquicia 2024");
	}

}
