package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mongock.runner.springboot.EnableMongock;

@SpringBootApplication
@EnableMongock
public class ProductService {
    public static void main(String[] args) {
        SpringApplication.run(ProductService.class, args);
    }
}