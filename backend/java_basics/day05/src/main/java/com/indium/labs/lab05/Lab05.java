package com.indium.labs.lab05;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lab05 {
    private static List<String[]> lines;

    public static void main(String[] args) throws IOException {
//        Files.readAllLines(Paths.get("/Users/prabhu/Documents/cities.csv"));
        lines = readCitiesFile();
        printAllCitiesGroupedByCountries();
        printCityWithLargestAndSmallestPopulation();
        printPopulationOf("China");

    }

    private static void printPopulationOf(String countryArg) {
        long total = 0;
        for (String[] itemArr : lines) {
            String country = itemArr[1];
            long population = Long.parseLong(itemArr[2]);
            if (country.equalsIgnoreCase(countryArg)) {
                total += population;
            }
        }
        System.out.println("Population of %s is %s".formatted(countryArg, total));
    }

    private static void printCityWithLargestAndSmallestPopulation() {
        String largestCity = "";
        String smallestCity = "";
        long largestCityPopulation = Long.MIN_VALUE;
        long smallestCityPopulation = Long.MAX_VALUE;

        for (String[] itemArr : lines) {
            String city = itemArr[0];
            long population = Long.parseLong(itemArr[2]);
            largestCity = population > largestCityPopulation ? city : largestCity;
            largestCityPopulation = population > largestCityPopulation ? population : largestCityPopulation;

            smallestCity = population < smallestCityPopulation ? city : smallestCity;
            smallestCityPopulation = population < smallestCityPopulation ? population : smallestCityPopulation;
        }
        System.out.println("""
                Largest city is %s, with population %s
                Smallest city is %s, with population %s
                """.formatted(largestCity, largestCityPopulation, smallestCity, smallestCityPopulation));
    }

    private static void printAllCitiesGroupedByCountries() {
        // Country -> List of cities
        Map<String, List<String>> countryCitiesMap = new HashMap<>();
        for (String[] itemArr : lines) {
            String city = itemArr[0];
            String country = itemArr[1];
            if (countryCitiesMap.containsKey(country)) {
                List<String> cities = countryCitiesMap.get(country);
                cities.add(city);
            } else {
                List<String> cities = new ArrayList<>();
                cities.add(city);
                countryCitiesMap.put(country, cities);
            }
        }
        Set<String> countries = countryCitiesMap.keySet();
        for (String country : countries) {
            System.out.println("***** " + country + " *******");
            System.out.println(countryCitiesMap.get(country));
        }
    }


    private static List<String[]> readCitiesFile() throws IOException {
        InputStream is = Lab05.class.getResourceAsStream("/cities.csv");
        String lines = new String(is.readAllBytes());
        String[] linesArr = lines.split("\\n");
        List<String[]> linesList = new ArrayList<>();
        for (String line : linesArr) {
            if (!line.contains("City,Country,Population (Metropolitan Area)")) {
                linesList.add(line.split((",")));
            }
        }
        //List<String> linesList = Arrays.asList(linesArr); //Creates an immutable list
        return linesList;
    }
}
