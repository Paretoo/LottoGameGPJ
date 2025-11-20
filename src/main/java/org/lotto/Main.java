package org.lotto;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        UserInput userInput = new UserInput(sc);
        ArrayList<Integer> enteredNumbers = userInput.getNumbersFromUser();
        RandomNumbers randomNumbers = new RandomNumbers(random);
        ArrayList<Integer> drawnNumbers = randomNumbers.addRandomNumbersToList();
        GameLogic game = new GameLogic(enteredNumbers, drawnNumbers);
        game.checkResults();
        sc.close();
    }
}