package com.example.again;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.again.*")
@EntityScan("com.example.again.*")
@SpringBootApplication
public class AgainApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgainApplication.class, args);
	}

}
