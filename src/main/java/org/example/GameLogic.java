package org.example;

import lombok.Data;

import java.util.ArrayList;


@Data
public class GameLogic {
    private UserInput userInput;
    private RandomNumbers randomNumbers;

    public void start(){
        ArrayList<Integer> enteredNumbers = userInput.getUserNumbers();
        ArrayList<Integer> generatedNumbers = randomNumbers.addRandomNumbersToList();
    }

}
