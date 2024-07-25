package com.indium.labs;

import java.util.Arrays;

public class Person {
    private String name;
    private City[] citiesVisited;
    private Person friend;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public City[] getCitiesVisited() {
        return citiesVisited;
    }


    public void setCitiesVisited(City[] citiesVisited) {
        this.citiesVisited = citiesVisited;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public void addCity(City newCity) {
        // Not a recommended practice; So prefer a dynamic collection like list or set
        City[] tempCities = new City[citiesVisited.length + 1];
        for (int i = 0; i < citiesVisited.length; i++) {
            tempCities[i] = citiesVisited[i];
        }
        tempCities[tempCities.length - 1] = newCity;
        this.citiesVisited = tempCities;
    }

    @Override
    public String toString() {
        return "Person: %s, Cities: %s".formatted(name, Arrays.toString(citiesVisited));
    }
}
