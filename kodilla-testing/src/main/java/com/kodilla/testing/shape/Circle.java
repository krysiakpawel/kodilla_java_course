package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public double getField() {
        double result = Math.pow(3.1415 * radius, 2);
        return result;

    }
}
