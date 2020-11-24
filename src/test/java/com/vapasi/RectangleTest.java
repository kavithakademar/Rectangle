package com.vapasi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void shoulReturnZeroIfLengthOrWidthIsZero()    {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(0,10);
        assertEquals(0,actualArea);
    }

    @Test
    public void shoudReturnTenForWidthTwoAndLengthFive()    {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(5,2);
        assertEquals(10,actualArea);

    }
    @Test
    public void shoulReturnAreaOfRectanleForGivenLengthAndWidth()   {
        Rectangle rect = new Rectangle();
        int actualArea = rect.calculateArea(10,20);
        assertEquals(200,actualArea);
    }
}
