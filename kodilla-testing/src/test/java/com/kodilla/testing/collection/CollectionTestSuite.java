package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminator() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(2);
        expectedArray.add(4);
        expectedArray.add(6);
        //When
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedArray, oddNumbers);
    }

    @Test
    public void testOddNumberExterminatorWithEmptyArray() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> expectedEmptyArray = new ArrayList<>();
        //When
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedEmptyArray, oddNumbers);

    }
}