package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void shouldReturnZeroIfLengthOrWidthIsZero() {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(0, 10);
        assertEquals(0, actualArea);
    }

    @Test
    public void shouldReturnTenForWidthTwoAndLengthFive() {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(5, 2);
        assertEquals(10, actualArea);

    }

    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(10, 20);
        assertEquals(200, actualArea);
    }
}
