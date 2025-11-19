package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Data
public class GameLogic {
    private ArrayList<Integer> enteredNumbers;
    private ArrayList<Integer> drawnNumbers;

    public void checkResults(){
        System.out.println("Typed numbers: " + enteredNumbers);
        System.out.println("Drawn numbers: " + drawnNumbers);

        Set<Integer> correctNumbers = new HashSet<>(enteredNumbers);
        correctNumbers.retainAll(drawnNumbers);

        System.out.println("You hit: " + correctNumbers.size());

    }

}
