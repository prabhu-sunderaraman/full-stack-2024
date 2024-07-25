package com.indium.labs;

public class City {
    private String name;
    private Country country;

    // Constructor overloading;
    // Again; NOT REALLY USEFUL IN MODERN DAY PROGRAMMING

    public City(String name) {
        this.name = name;
    }

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public City(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City: %s, {%s}".formatted(name, country);
    }
}
