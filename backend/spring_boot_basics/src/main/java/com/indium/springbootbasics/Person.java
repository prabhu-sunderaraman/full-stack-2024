package com.indium.springbootbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    @Value("Sam")
    private String name;

    @Value("${cities: []}")
    private List<String> citiesVisited;

    @Autowired
    @Qualifier("passTimeActivities2")
    private List<String> hobbies;

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitiesVisited() {
        return citiesVisited;
    }

    public void setCitiesVisited(List<String> citiesVisited) {
        this.citiesVisited = citiesVisited;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }
}
