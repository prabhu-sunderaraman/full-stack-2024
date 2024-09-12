package com.indium;

public class GuessingGame {
    private int target;
    private String message;

    public GuessingGame() {
        this.target = (int) (Math.random() * 100) + 1;
    }

    public int getTarget() {
        return target;
    }

    public void play(int guess) {
        if (guess < 1 || guess > 100) {
            throw new InvalidInputException("Invalid input");
        }
        if (guess > target) {
            message = "Aim lower";
        } else if (guess < target) {
            message = "Aim higher";
        } else {
            message = "You got it!";
        }
    }

    public String getMessage() {
        return message;
    }
}
