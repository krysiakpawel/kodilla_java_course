package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);

        if (addResult == 10){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractResult = calculator.subtract(10, 5);

        if (subtractResult == 5){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}