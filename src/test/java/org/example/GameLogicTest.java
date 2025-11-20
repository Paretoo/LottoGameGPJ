package org.example;

import org.junit.jupiter.api.Test;
import org.lotto.GameLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
    @Test
    void shouldWinAPrize() {
        ArrayList<Integer> enteredNumbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30));
        ArrayList<Integer> drawnNumbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 40, 50));
        GameLogic game = new GameLogic(enteredNumbers, drawnNumbers);
        Set<Integer> correctedNumbers = new HashSet<>(enteredNumbers);
        correctedNumbers.retainAll(drawnNumbers);
        assertEquals(4, correctedNumbers.size());
        assertTrue(correctedNumbers.contains(10));
        assertTrue(correctedNumbers.contains(20));
    }
}