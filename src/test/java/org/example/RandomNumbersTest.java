package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    private RandomNumbers randomNumbers;
    private List<Integer> result;

    @BeforeEach
    void setUp(){
        randomNumbers = new RandomNumbers();
        result = randomNumbers.addRandomNumbersToList();
    }

    @Test
    void shouldGenerateSixNumbersInArray(){
        assertEquals(6, result.size());
    }

    @Test
    void shouldGenerateNumbersInRange(){
        for(int number : result){
            assertTrue(number >= 1 && number <= 99);
        }
    }

}