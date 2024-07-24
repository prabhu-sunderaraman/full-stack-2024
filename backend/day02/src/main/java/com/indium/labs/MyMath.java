package com.indium.labs;

import java.util.Locale;
import java.util.Scanner;

public class MyMath {
    public void calculateSumOfOddNumbersBetween1To10001() {
        long sum = 0L;
        for (int i = 1; i <= 10001; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers: %s".formatted(sum));
    }

    public void calculateIntAverageOfNumbersBetween1To10001() {
        int[] exclusionList = {10, 19, 21, 39, 309, 431, 643, 942, 1209, 7981, 8888, 9910};
        int sum = 0;
        for (int i = 1; i <= 10001; i++) {
            sum += i;
        }
        for (int num : exclusionList) {
            sum -= num;
        }
        int average = sum / (10001 - exclusionList.length);
        System.out.println("Average: %s".formatted(average));
    }

    public void parseStringInput() {
        String input = "+5 -1 +9 +5 -67 +5 -3 +2 -4 +6 +8 -13 +2 -4 +6 +18 -3 +2 -4 +6 +88 +15 -1 +9 +5 -67 +45 -3 +2 -4 +36 +8 -13 +2 -4 +6 +18 -3 +2 -74 +11 +109";
        int sum = 0;
        String[] inputArr = input.split(" ");
        for (String item : inputArr) {
            sum += Integer.parseInt(item);
        }
        System.out.println("Sum: %s".formatted(sum));
    }


    public void performStringInputOperation() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a word");
            String word = scanner.next();
            if (wordPresentIn(word, words)) {
                System.out.println("%s is already present".formatted(word));
            } else {
                stringBuilder.append(word);
                stringBuilder.append(", ");
                words[i] = word;
            }
        }
        System.out.println(stringBuilder.toString().toUpperCase());
    }

    private boolean wordPresentIn(String word, String[] words) {
        boolean present = false;
        for (int i = 0; i < words.length; i++) {
            if (word.equalsIgnoreCase(words[i])) {
                present = true;
                break;
            }
        }
        return present;
    }
}
