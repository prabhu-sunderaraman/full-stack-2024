package com.indium.labs;

import static com.indium.labs.ValidationConstants.*;

public class Lab06 {
    public static void main(String[] args) {
        String username = "adminis";
        String password = "Admin123";

        boolean usernameValid = isNotNull
                .and(isNotBlank)
                .and(isNotEmpty)
                .and(minLength.apply(8))
                .and(maxLength.apply(12))
                .or(hasUppercaseLetter)
                //.and(usernameMinLength)
                //.and(usernameMaxLength)
                .test(username);

        boolean passwordValid = isNotNull
                .and(isNotBlank)
                .and(isNotEmpty)
                .and(minLength.apply(8))
                .and(maxLength.apply(14))
//                .and(passwordMinLength)
//                .and(passwordMaxLength)
                .and(hasUppercaseLetter)
                .and(hasDigit)
                .test(password);

        System.out.println("Username valid? " + usernameValid);
        System.out.println("Password valid? " + passwordValid);
    }
}
