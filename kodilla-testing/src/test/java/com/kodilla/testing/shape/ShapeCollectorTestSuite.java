package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddFigureToList() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle(5, 4);

        //When
        shapeCollector.addFigure(triangle1);

        //Then
        Assert.assertEquals(shapeCollector.getShapes().size(), 1);

    }

    @Test
    public void testRemoveFigureFromList() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle(5);
        shapeCollector.addFigure(circle1);

        //When
        shapeCollector.removeFigure(circle1);

        //Then
        Assert.assertTrue(shapeCollector.getShapes().isEmpty());
    }

    @Test
    public void testGetNElementFromList() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square(6);
        shapeCollector.addFigure(square1);
        String shape = shapeCollector.getFigure(0).getShape();

        //When & Then
        Assert.assertEquals(shapeCollector.getFigure(0), square1);
        Assert.assertEquals("Square", shape);
    }
}
