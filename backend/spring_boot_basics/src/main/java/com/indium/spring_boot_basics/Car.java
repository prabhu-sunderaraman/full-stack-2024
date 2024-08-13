package com.indium.spring_boot_basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("BMW")
    private String model;

    public String getModel() {
        return model;
    }
}
