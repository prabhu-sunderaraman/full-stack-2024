package com.indium.mathclientapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/math")
public class MathController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${square-api.url}")
    private String squareApiUrl;

    @Value("${cube-api.url}")
    private String cubeApiUrl;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @GetMapping("/cube/{number}")
    public String getCubeOfNumber(@PathVariable int number) {
        return circuitBreakerFactory
                .create("cube-circuit")
                .run(() -> {
                            System.out.println("******* Trying to call cube service for " + number);
                            try {
                                int cube = restTemplate.getForObject(cubeApiUrl + "/" + number, Integer.class);
                                return "Cube of " + number + " is " + cube;
                            } catch (Exception ex) {
//                                System.out.println("Error: " + ex.getMessage());
                                throw ex;
                            }
                        },
                        throwable -> {
//                     Usually we call another service and email the administrator or raise an alert
                            System.out.println("======= Fallback of cube service called for " + number);
                            return "Oops! Service is down! Cube of " + number + " is not available at the moment";
                        });
    }

    @GetMapping("/square/{number}")
    public String getSquareOfNumber(@PathVariable int number) {
        int square = restTemplate.getForObject(squareApiUrl + "/" + number, Integer.class);
        return "Square of " + number + " is " + square;
    }

}
