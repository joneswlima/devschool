package com.howtodoinjava.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; 

@ContextConfiguration

@SpringBootApplication 
public class SpringBootDemoApplication {

    public static void main(String[] args) {
		System.out.println("Iniciando SpringBoot 01!");
        SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println(" SpringBoot em execução em --> http://localhost:8080/employees/");
    }
}
