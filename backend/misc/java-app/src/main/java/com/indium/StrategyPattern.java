package com.indium;

import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {
    public static void main(String[] args) {
        // Strategy Pattern - Behavioral Pattern
        // Defines a family of algorithms, encapsulates each one, and makes them interchangeable
        // Lets the algorithm vary independently from the clients that use it

        compute(number -> number % 2 == 0);
        compute(StrategyPattern::isPrime);
        compute(number -> number % 2 != 0);
    }

    static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    static void compute(Predicate<Integer> strategy) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        numbers
                .stream()
                .filter(strategy)
                .forEach(System.out::println);
    }

//    static void computeEven() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .forEach(System.out::println);
//    }
//
//    static void computePrime() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        numbers.stream()
//                .filter(number -> {
//                    if (number == 1) {
//                        return false;
//                    }
//                    for (int i = 2; i <= number / 2; i++) {
//                        if (number % i == 0) {
//                            return false;
//                        }
//                    }
//                    return true;
//                })
//                .forEach(System.out::println);
//    }
//
//    static void computeOdd() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        numbers.stream()
//                .filter(number -> number % 2 != 0)
//                .forEach(System.out::println);
//    }
}


