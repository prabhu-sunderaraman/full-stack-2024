package com.indium.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CalculatorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorAppApplication.class, args);
    }

}
