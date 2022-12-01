package com.study.ex_hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ExHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExHexagonalApplication.class, args);
	}

}
