package com.dred.spring.basico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBootApplication implements CommandLineRunner {
	@Autowired
	private Producto producto;
	
	@Autowired
	private Casa casa;

	public static void main(String[] args) {
		SpringApplication.run(DemoBootApplication.class, args);
	}
	public void run(String... args) throws Exception {
		System.out.println("Se ha creado el objeto Producto: "+producto);
		System.out.println("Se ha creado el objeto Casa: "+casa);
		
	}
}
