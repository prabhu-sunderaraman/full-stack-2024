package com.indium.labs;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public static Item compareItems(Item item1, Item item2) {
        return item1.getPrice() > item2.getPrice() ? item1 : item2;
    }

    public String toJson() {
        String json = """
                {
                    "name": %s,
                    "price": %s
                }
                """.formatted(name, price);
        return json;
    }
}