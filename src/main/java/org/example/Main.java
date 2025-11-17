package org.example;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        RandomNumbers randomNumbers = new RandomNumbers(random);


        System.out.println(randomNumbers.addRandomNumbersToList());



//        UserInput userInput = new UserInput();
//
//        userInput.getNumbersFromUser();
//        userInput.printUserNumbers();

    }
}