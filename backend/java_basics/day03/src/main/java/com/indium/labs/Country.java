package com.indium.labs;

public class Country {
    private String name;
    private String capital;
    private double population;

    public Country(String name, String capital, double population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    // getter and setter are referred to as properties in Java
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country: %s, capital: %s, Population: %s".formatted(name, capital, population);
    }
}
