package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private Rectangle rect;
    private int actualArea;
    private int actualPerimeter;


    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        rect = Rectangle.createRectangle(10, 20);
        actualArea = rect.area();
        assertEquals(200, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfRectangleForGivenLengthAndWidth() {
        rect = Rectangle.createRectangle(10, 20);
        actualPerimeter = rect.perimeter();
        assertEquals(60, actualPerimeter);

    }
    @Test
    public void shouldReturnAreaOfSquareForGivenSide() {

        rect = Rectangle.createSquare(10);
        int actualArea = rect.area();
        assertEquals(100, actualArea);
    }

    @Test
    public void shouldReturnPerimeterOfSquareForGivenSide() {

        rect = Rectangle.createSquare(15);
        int actualArea = rect.perimeter();
        assertEquals(60, actualArea);
    }


}
