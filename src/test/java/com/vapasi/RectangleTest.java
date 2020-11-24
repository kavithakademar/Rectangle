package com.vapasi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private Rectangle rect;
    private int actualArea;

    @BeforeEach
    public void setup() {
        rect = new Rectangle();
    }

    @Test
    public void shouldReturnZeroIfLengthOrWidthIsZero() {
        actualArea = rect.calculateArea(0, 10);
        assertEquals(0, actualArea);
    }

    @Test
    public void shouldReturnTenForWidthTwoAndLengthFive() {
        actualArea = rect.calculateArea(5, 2);
        assertEquals(10, actualArea);

    }

    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        actualArea = rect.calculateArea(10, 20);
        assertEquals(200, actualArea);
    }
}
