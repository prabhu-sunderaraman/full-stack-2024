package com.indium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class GuessingGameTest {
    private GuessingGame guessingGame;

    @BeforeEach
    public void setup() {
        guessingGame = new GuessingGame();
    }

    @Test
    public void testSetup() {
        assertNotNull(guessingGame);
    }

    @Test
    public void testTargetIsGeneratedBtn1And100() {
        int target = guessingGame.getTarget();
        assertTrue(target >= 1 && target <= 100);
    }

    @Test
    public void testPlayWithGuessMoreThanTarget() {
        setRandomTargetUsingReflection(guessingGame, 40);
        int guess = 50;
        guessingGame.play(guess);
        assertTrue(guessingGame.getMessage().equals("Aim lower"));
    }

    @Test
    public void testPlayWithGuessLessThanTarget() {
        setRandomTargetUsingReflection(guessingGame, 60);
        int guess = 50;
        guessingGame.play(guess);
        assertTrue(guessingGame.getMessage().equals("Aim higher"));
    }

    @Test
    public void testPlayWithGuessEqualToTarget() {
        setRandomTargetUsingReflection(guessingGame, 50);
        int guess = 50;
        guessingGame.play(guess);
        assertTrue(guessingGame.getMessage().equals("You got it!"));
    }

    @Test
    public void testPlayWithNumberLessThan0OrGreaterThan100() {
        int guess = 0;
        assertThrows(InvalidInputException.class, () -> guessingGame.play(guess));
    }

    private void setRandomTargetUsingReflection(GuessingGame guessingGame, int i) {
        try {
            Field field = GuessingGame.class.getDeclaredField("target");
            field.setAccessible(true);
            field.set(guessingGame, i);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
