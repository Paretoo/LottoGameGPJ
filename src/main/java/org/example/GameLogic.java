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
        System.out.println("You entered numbers: ");
        System.out.println();
    }

}
