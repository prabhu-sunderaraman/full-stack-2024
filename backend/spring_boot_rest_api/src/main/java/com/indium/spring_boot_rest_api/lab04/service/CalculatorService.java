package com.indium.spring_boot_rest_api.lab04.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }

    public int square(int num) {
        return num * num;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int num1, int num2) {
        return num1 / num2;
    }
}
