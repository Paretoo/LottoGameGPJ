package org.example;

import org.junit.jupiter.api.Test;
import org.lotto.UserInput;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class UserInputTest {

    @Test
    void shouldGenerateSixNumbers() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt())
                .thenReturn(10, 20, 30, 35, 40, 50);
        UserInput userInput = new UserInput(mockScanner);
        List<Integer> numbers = userInput.getNumbersFromUser();
        assertEquals(6, numbers.size());
        assertTrue(numbers.contains(10));
        assertTrue(numbers.contains(30));
        assertTrue(numbers.contains(50));
    }

    @Test
    void shouldIgnoreDuplicate() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt())
                .thenReturn(5, 5, 10, 15, 20, 15, 27, 87);
        UserInput userInput = new UserInput(mockScanner);
        List<Integer> numbers = userInput.getNumbersFromUser();
        assertEquals(6, numbers.size());
    }

    @Test
    void shouldHandleInputMissMatchException(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt())
                .thenThrow(new InputMismatchException())
                .thenReturn(5, 10, 15, 20, 25, 30);
        UserInput userInput = new UserInput(mockScanner);
        List<Integer> numbers = userInput.getNumbersFromUser();
        assertEquals(6, numbers.size());
        assertTrue(numbers.contains(5));
    }

}