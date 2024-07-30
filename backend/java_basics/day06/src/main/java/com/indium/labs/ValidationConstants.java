package com.indium.labs;

import java.util.function.Function;
import java.util.function.Predicate;

public interface ValidationConstants {
    Predicate<String> isNotNull = value -> value != null;
    Predicate<String> isNotBlank = value -> !value.isBlank();
    Predicate<String> isNotEmpty = value -> !value.isEmpty();
    Function<Integer, Predicate<String>> minLength = num -> value -> value.length() >= num;
    Function<Integer, Predicate<String>> maxLength = num -> value -> value.length() <= num;


    // Lot of duplication
    Predicate<String> usernameMinLength = value -> value.length() >= 6;
    Predicate<String> usernameMaxLength = value -> value.length() <= 12;

    Predicate<String> passwordMinLength = value -> value.length() >= 8;
    Predicate<String> passwordMaxLength = value -> value.length() <= 14;

    Predicate<String> hasUppercaseLetter = value -> value.matches(".*[A-Z].*");
    Predicate<String> hasDigit = value -> value.matches(".*\\d+.*");
    
}
