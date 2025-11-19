package org.example;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner sc = new Scanner(System.in);

        RandomNumbers randomNumbers = new RandomNumbers(random);
        UserInput userInput = new UserInput(sc);




    }
}