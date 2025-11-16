package org.example;

import lombok.Data;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Data
public class RandomNumbers {
    private SecureRandom secureRandom = new SecureRandom();


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
