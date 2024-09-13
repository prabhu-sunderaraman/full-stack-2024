package com.indium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameStoreTest {
    private GameStore gameStore;

    @BeforeEach
    public void setup() {
        gameStore = new GameStore();
    }

    @Test
    public void testSetup() {
        assertNotNull(gameStore);
    }

    @Test
    public void testSaveGameResults() {
        int target = 66;
        int attempts = 5;
        boolean saved = gameStore.saveGameResults(target, attempts);
        assertTrue(saved);
    }

}
