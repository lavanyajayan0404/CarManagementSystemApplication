package com.example.carmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Car Management API", version = "1.0", description = "API for managing car details"))
public class CarManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarManagementSystemApplication.class, args);
    }
}
