package com.diego.iniciandoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//Es el punto de entrada de mi programa
public class IniciandoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniciandoSpringApplication.class, args);//Le dice a la clase Spring aplication que llame a esa clase y la ponga a funcionar
	}

}
