package com.howtodoinjava.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class SpringBootDemoApplication {

    public static void main(String[] args) {
		System.out.println("Iniciando SpringBoot 01!");
        SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("Iniciando SpringBoot 02!");
    }
}
