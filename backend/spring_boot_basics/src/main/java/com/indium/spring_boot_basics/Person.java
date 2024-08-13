package com.indium.spring_boot_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    @Value("Sam")
    private String name;

    @Autowired
    @Qualifier("passTimeActivities2")
    private List<String> hobbies;

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }
}
