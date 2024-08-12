package com.indium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    private String name;

    public Manager(@Value("Ram") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
