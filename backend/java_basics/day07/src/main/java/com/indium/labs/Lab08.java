package com.indium.labs;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lab08 {
    static List<String> linesLst = null;

    public static void main(String[] args) throws IOException {
        linesLst = readCitiesFile();
//        storeDistinctCityNames("cities.txt");
//        storeDistinctCountryNames("countries.txt");

        storeNames("cities.txt", line -> line.split(",")[0]);
        storeNames("countries.txt", line -> line.split(",")[1]);
    }

    private static void storeNames(String fileName, Function<String, String> lineSplitFunction) throws IOException {
        List<String> names = linesLst
                .stream()
                .skip(1)
                .map(lineSplitFunction)
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), names);
    }

    private static void storeDistinctCountryNames(String fileName) throws IOException {
        List<String> countryNames = linesLst
                .stream()
                .skip(1)
                .map(line -> line.split(",")[1])
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), countryNames);
    }

    private static void storeDistinctCityNames(String fileName) throws IOException {
        List<String> cityNames = linesLst
                .stream()
                .skip(1)
                .map(line -> line.split(",")[0])
                .distinct()
                .toList();
        Files.write(Paths.get(fileName), cityNames);
    }

    private static List<String> readCitiesFile() throws IOException {
        InputStream is = Lab08.class.getResourceAsStream("/cities.csv");
        String lines = new String(is.readAllBytes());
        String[] linesArr = lines.split("\\n");
        List<String> linesLst = Arrays.stream(linesArr).toList();
        return linesLst;
    }
}
