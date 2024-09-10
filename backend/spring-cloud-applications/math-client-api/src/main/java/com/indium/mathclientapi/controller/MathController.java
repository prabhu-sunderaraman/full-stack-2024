package com.indium.mathclientapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @GetMapping("/cube/{number}")
    public String getCubeOfNumber(@PathVariable int number) {
        int cube = restTemplate.getForObject(cubeApiUrl + "/" + number, Integer.class);
        return "Cube of " + number + " is " + cube;
    }

    @GetMapping("/square/{number}")
    public String getSquareOfNumber(@PathVariable int number) {
        int square = restTemplate.getForObject(squareApiUrl + "/" + number, Integer.class);
        return "Square of " + number + " is " + square;
    }

}
