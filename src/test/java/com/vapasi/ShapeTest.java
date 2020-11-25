package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

        private int actualArea;
    private int actualPerimeter;


    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
       Shape rect = Shape.createRectangle(10, 20);
        actualArea = rect.area();

        assertEquals(200, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfRectangleForGivenLengthAndWidth() {
        Shape  rect = Shape.createRectangle(10, 20);
        actualPerimeter = rect.perimeter();
        assertEquals(60, actualPerimeter);

    }
    @Test
    public void shouldReturnAreaOfSquareForGivenSide() {

        Shape square = Shape.createSquare(10);
         actualArea = square.area();
        assertEquals(100, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfSquareForGivenSide() {

        Shape square = Shape.createSquare(15);
         actualArea = square.perimeter();
        assertEquals(60, actualArea);
    }

   @Test
    public void shouldReturnAreaOfCircleForGivenRadius() {

        Shape circle = Shape.createCircle(10);
         actualArea = circle.area();
         assertEquals(314,actualArea);
   }
    @Test
    public void shouldReturnPerimeterOfCircleForGivenRadius() {

        Shape circle = Shape.createCircle(5);
        actualArea = circle.perimeter();
        assertEquals(31.4,actualArea);
    }
}
