package com.indium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("BMW")
    String model;

    @Value("2023")
    int year;

    @Autowired
    Engine engine;
}
