package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private float actualArea;
    private float actualPerimeter;


    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        Rectangle rect = Rectangle.createRectangle(10, 20);
        actualArea = rect.area();
        assertEquals(200, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfRectangleForGivenLengthAndWidth() {
        Rectangle rect = Rectangle.createRectangle(10, 20);
        actualPerimeter = rect.perimeter();
        assertEquals(60, actualPerimeter);

    }

    @Test
    public void shouldReturnAreaOfSquareForGivenSide() {

        Rectangle square = Rectangle.createSquare(10);
        actualArea = square.area();
        assertEquals(100, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfSquareForGivenSide() {

        Rectangle square = Rectangle.createSquare(15);
        actualArea = square.perimeter();
        assertEquals(60, actualArea);
    }


}
