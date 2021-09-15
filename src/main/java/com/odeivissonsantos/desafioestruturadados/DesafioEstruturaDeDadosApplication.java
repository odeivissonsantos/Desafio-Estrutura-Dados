package com.odeivissonsantos.desafioestruturadados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioEstruturaDeDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioEstruturaDeDadosApplication.class, args);
	}

}
