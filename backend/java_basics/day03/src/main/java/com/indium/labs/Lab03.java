package com.indium.labs;

public class Lab03 {
    public static void main(String[] args) {
        Country india = new Country("India", "New Delhi", 1400000000);
//        india.capital = "Chennai";
        System.out.println(india.getName()); //india.name
        System.out.println(india.getCapital()); //india.capital

        City chennai = new City("Chennai", india);
        City hyd = new City("Hyderabad", india);

        Person ram = new Person("Ram");
        ram.setCitiesVisited(new City[]{chennai, hyd});

        ram.addCity(new City("Pune", india));
        ram.addCity(new City("Kochi", india));

        City[] citiesVisitedByRam = ram.getCitiesVisited();
        for (City city : citiesVisitedByRam) {
            System.out.println(city.getName());
        }
        System.out.println();
        ram.addCity(new City("Vizag", india));

        for (City city : ram.getCitiesVisited()) {
            System.out.println(city.getName());
        }
        ram.setFriend(new Person("Sam"));
        System.out.println("***** Summary *****");

        System.out.println(ram);

    }
}
