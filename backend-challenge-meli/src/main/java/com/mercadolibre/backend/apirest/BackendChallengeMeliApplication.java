package com.mercadolibre.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackendChallengeMeliApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendChallengeMeliApplication.class, args);
	}

}
