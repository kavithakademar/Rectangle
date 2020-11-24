package com.vapasi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private Rectangle rect;
    private int actualArea;
    private int actualPerimeter;


    @Test
    public void shouldReturnAreaOfRectangleForGivenLengthAndWidth() {
        rect = new Rectangle(10, 20);
        actualArea = rect.calculateArea();
        assertEquals(200, actualArea);
    }

    @Test
    public void shouldReturnSixteenForLengthFiveAndWidthThree(){

        rect = new Rectangle(5,3);
       actualPerimeter = rect.calculatePerimeter();
       assertEquals(16,actualPerimeter);

    }

}
