package com.indium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GuessingGameTest {
    @InjectMocks
    private GuessingGame guessingGame;

    @Mock
    private GameStore gameStore;

//    @BeforeEach
//    public void setup() {
//        guessingGame = new GuessingGame();
////        gameStore = new GameStore();
////        guessingGame.setGameStore(gameStore);
//    }

    @Test
    public void testSetup() {
        assertNotNull(guessingGame);
        assertNotNull(guessingGame.getGameStore());
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
        when(gameStore.saveGameResults(50, 1)).thenReturn(true);
        setRandomTargetUsingReflection(guessingGame, 50);
        int guess = 50;
        guessingGame.play(guess);
        assertTrue(guessingGame.getMessage().equals("You got it!"));
        verify(gameStore, times(1)).saveGameResults(50, 1);
    }

    @Test
    public void testPlayWithNumberLessThan0OrGreaterThan100() {
        int guess = 0;
        assertThrows(InvalidInputException.class, () -> guessingGame.play(guess));
    }

    @Test
    public void testAttempts() {
        setRandomTargetUsingReflection(guessingGame, 50);
        guessingGame.play(40);
        guessingGame.play(43);
        assertEquals(2, guessingGame.getAttempts());
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
