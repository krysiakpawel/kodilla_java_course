package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public String getShape() {
        return "Triangle";
    }

    @Override
    public double getField() {
        double result = base * height / 2;
        return result;
    }
}
