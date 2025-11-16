package org.example;

import lombok.Data;

import java.security.SecureRandom;
import java.util.ArrayList;

@Data
public class RandomNumbers {
    private SecureRandom secureRandom = new SecureRandom();
    private ArrayList<Integer> arrayOfRandomNumbers = new ArrayList<>();


    public ArrayList<Integer> addRandomNumbersToList() {
        for (int i = 0; i < 6; i++) {
            int randomNumber = secureRandom.nextInt(99) + 1;
            arrayOfRandomNumbers.add(randomNumber);
        }
        return arrayOfRandomNumbers;
    }
}
