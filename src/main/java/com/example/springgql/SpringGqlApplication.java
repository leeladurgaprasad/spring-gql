package com.example.springgql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.springgql.model")
@EnableJpaRepositories
public class SpringGqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGqlApplication.class, args);
	}

}
