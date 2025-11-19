package org.example;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner sc = new Scanner(System.in);

//        RandomNumbers randomNumbers = new RandomNumbers(random);
//
//
//        System.out.println(randomNumbers.addRandomNumbersToList());



        UserInput userInput = new UserInput(sc);

        userInput.getNumbersFromUser();
        userInput.printUserNumbers();

    }
}