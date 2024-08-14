package com.indium.springbootbasics;

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
