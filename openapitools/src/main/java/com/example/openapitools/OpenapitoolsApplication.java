package com.example.openapitools;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class OpenapitoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapitoolsApplication.class, args);
    }

}
