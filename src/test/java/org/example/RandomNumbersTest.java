package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RandomNumbersTest {
    private Random secureRandom;
    private RandomNumbers randomNumbers;
    private List<Integer> result;


    void setUp() {
        secureRandom = new SecureRandom();
        randomNumbers = new RandomNumbers(secureRandom);
        result = randomNumbers.addRandomNumbersToList();
    }

    @Test
    void shouldGenerateSixNumbersInArray() {
        setUp();
        assertEquals(6, result.size());
    }

    @Test
    void shouldGenerateNumbersInRange() {
        setUp();
        for (int number : result) {
            assertTrue(number >= 1 && number <= 99);
        }
    }


}