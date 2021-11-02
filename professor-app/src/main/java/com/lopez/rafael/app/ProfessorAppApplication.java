package com.lopez.rafael.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.lopez.rafael.controller", "com.lopez.rafael.service",
		"com.lopez.rafael.security"})
@EntityScan("com.lopez.rafael.entity")
@EnableJpaRepositories("com.lopez.rafael.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ProfessorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessorAppApplication.class, args);
	}

}
