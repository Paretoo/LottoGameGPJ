package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@Data
public class UserInput {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> userNumbers = new ArrayList<>();

    public ArrayList<Integer> getNumbersFromUser(){
        System.out.println("Welcome to Lotto! Please type 6 numbers and try your luck!");
        try {
            for (int i = 0; i < 6; i++) {
            System.out.print("Please type a number from 1 to 99: ");
            int selectedNumber = sc.nextInt();
            if (selectedNumber >= 1 && selectedNumber <= 99)
                userNumbers.add(selectedNumber);
            else {
                System.out.println("The number is not in range. Try again!");
                i--;
            }
        }
        } catch (InputMismatchException e){
            System.out.println("You entered text, please enter a number!");
        }
       return userNumbers;
    }

    public void printUserNumbers(){
        System.out.println(userNumbers);
    }
}
