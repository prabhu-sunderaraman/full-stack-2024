package com.indium.spring_boot_basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("Sam")
    private String name;

    public String getName() {
        return name;
    }
}
