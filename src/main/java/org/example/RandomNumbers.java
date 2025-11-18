package org.example;

import lombok.Data;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

@Data
public class RandomNumbers {
    private final Random secureRandom;


    public ArrayList<Integer> addRandomNumbersToList() {
        ArrayList<Integer> randomNumbersList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomNumber = secureRandom.nextInt(99) + 1;
            if (randomNumbersList.contains(randomNumber)){
                i--;
            } else {
                randomNumbersList.add(randomNumber);
            }
        }
        return randomNumbersList;
    }
}
