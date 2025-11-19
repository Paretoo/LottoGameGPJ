package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Data
public class GameLogic {
    private final ArrayList<Integer> enteredNumbers;
    private final ArrayList<Integer> drawnNumbers;

    public void checkResults(){
        System.out.println("Typed numbers: " + enteredNumbers);
        System.out.println("Drawn numbers: " + drawnNumbers);

        Set<Integer> correctNumbers = new HashSet<>(enteredNumbers);
        correctNumbers.retainAll(drawnNumbers);

        if(correctNumbers.size() < 3){
            System.out.println("********************");
            System.out.println("You hit: " + correctNumbers.size() + " " + correctNumbers);
            System.out.println("You didn't win the price :(");
            System.out.println("********************");
        } else {
            System.out.println("********************");
            System.out.println("You hit: " + correctNumbers.size() + " " + correctNumbers);
            System.out.println("You won a prize! :)");
            System.out.println("********************");
        }



    }

}
