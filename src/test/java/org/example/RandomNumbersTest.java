package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    private RandomNumbers randomNumbers;
    private List<Integer> result;


    void setUp(){
        randomNumbers = new RandomNumbers();
        result = randomNumbers.addRandomNumbersToList();
    }

    @Test
    void shouldGenerateSixNumbersInArray(){
        setUp();
        assertEquals(6, result.size());
    }

    @Test
    void shouldGenerateNumbersInRange(){
        setUp();
        for(int number : result){
            assertTrue(number >= 1 && number <= 99);
        }
    }

    @Test
    void shouldReturnArrayListWithSixNumbersEvenWhenNumbersAreDuplicated(){
        randomNumbers = new RandomNumbers();

    }

}