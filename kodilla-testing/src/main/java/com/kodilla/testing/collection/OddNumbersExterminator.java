package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> oddNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
