package com.indium;

public class GuessingGame {
    private int target;
    private String message;
    private int attempts;
    private GameStore gameStore;

    public GuessingGame() {
        this.target = (int) (Math.random() * 100) + 1;
    }

    public int getTarget() {
        return target;
    }

    public void play(int guess) {
        attempts++;
        if (guess < 1 || guess > 100) {
            throw new InvalidInputException("Invalid input");
        }

        if (guess > target) {
            message = "Aim lower";
        } else if (guess < target) {
            message = "Aim higher";
        } else {
            message = "You got it!";
            boolean saved = gameStore.saveGameResults(target, attempts);
            if (!saved) {
                throw new RuntimeException("Failed to save game results");
            }
        }
    }

    public String getMessage() {
        return message;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setGameStore(GameStore gameStore) {
        this.gameStore = gameStore;
    }

    public GameStore getGameStore() {
        return gameStore;
    }
}
