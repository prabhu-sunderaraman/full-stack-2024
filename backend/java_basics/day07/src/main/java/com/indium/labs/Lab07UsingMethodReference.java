package com.indium.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab07 {
    private static final Function<Item, String> itemNameFunction = item -> item.getName();

    static List<Item> items = Arrays.asList(
            new Item("Nike", 20.45),
            new Item("Adidas", 31.45),
            new Item("Reebok", 29.25),
            new Item("Puma", 25.15),
            new Item("Fila", 15.15));

    public static void main(String[] args) {
        printNamesOfAllShoes();
        generateSetOfShoeNames();
        printCostliestShoe();
        generateCsvOfItemNames();
        generateJson();
    }

    private static void generateJson() {
        String json = items
                .stream()
                .map(item -> """
                        {
                            "name": %s,
                            "price": %s
                        }
                        """.formatted(item.getName(), item.getPrice()))
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(json);
    }

    private static void generateCsvOfItemNames() {
        String namesInCsv = items
                .stream()
                .map(itemNameFunction)
                .collect(Collectors.joining(", "));
        System.out.println(namesInCsv);
    }

    private static void printCostliestShoe() {
        Item costliestItem = items
                .stream()
                .reduce((costlyItem, nextItem) -> costlyItem.getPrice() > nextItem.getPrice() ? costlyItem : nextItem)
                .get();
        System.out.println(costliestItem.getName() + ": " + costliestItem.getPrice());
    }

    private static void generateSetOfShoeNames() {
        Set<String> shoeNames = items
                .stream()
                .map(itemNameFunction)
                .collect(Collectors.toSet());

        shoeNames.forEach(name -> System.out.println(name));

        // You don't need to create a stream() to use forEach method

    }

    private static void printNamesOfAllShoes() {
        items
                .stream()
                .map(itemNameFunction)
                .forEach(item -> System.out.println(item));
    }
}
