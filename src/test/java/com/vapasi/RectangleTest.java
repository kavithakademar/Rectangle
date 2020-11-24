package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private Rectangle rect;
    private int actualArea;


    @Test
    public void shouldReturnZeroIfLengthOrWidthIsZero() {
        rect = new Rectangle(0, 10);
        actualArea = rect.calculateArea();
        assertEquals(0, actualArea);
    }

    @Test
    public void shouldReturnTenForWidthTwoAndLengthFive() {
        rect = new Rectangle(5, 2);
        actualArea = rect.calculateArea();
        assertEquals(10, actualArea);

    }

    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        rect = new Rectangle(10, 20);
        actualArea = rect.calculateArea();
        assertEquals(200, actualArea);
    }
}
