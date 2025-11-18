package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@Data
public class UserInput {
    private Scanner sc;
    private ArrayList<Integer> userNumbers = new ArrayList<>();

    public UserInput(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<Integer> getNumbersFromUser() {
        System.out.println("Welcome to Lotto! Please type 6 numbers and try your luck!");
        for (int i = 0; i < 6; i++) {
            System.out.print("Please type a number from 1 to 99: ");
            try {
                int selectedNumber = sc.nextInt();
                if (selectedNumber >= 1 && selectedNumber <= 99) {
                    if (userNumbers.contains(selectedNumber)) {
                        System.out.println("This number has been already entered!");
                        i--;
                    } else {
                        userNumbers.add(selectedNumber);
                    }
                } else {
                    System.out.println("The number is not in range. Try again!");
                    i--;
                }

            } catch (InputMismatchException e) {
                System.out.println("You entered text, please enter a number!");
                sc.nextLine();
                i--;
            }
        }
        return userNumbers;
    }

    // Temporary method for testing
    public void printUserNumbers() {
        System.out.println(userNumbers);
    }
}
