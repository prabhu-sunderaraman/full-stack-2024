package com.indium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("ABV")
    private String title;
    @Value("34.56")
    private double price;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
