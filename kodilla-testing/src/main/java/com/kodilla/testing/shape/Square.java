package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public double getField() {
        double result = side * side;
        return result;
    }
}
