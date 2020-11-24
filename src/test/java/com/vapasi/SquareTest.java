package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private Square square;

    @Test
    public void shouldReturnAreaForGivenSide() {

        square = new Square(10);
        int actualArea = square.area();
        assertEquals(100, actualArea);
    }

    @Test
    public void shouldReturnPerimeterForGivenSide() {

        square = new Square(15);
        int actualArea = square.perimeter();
        assertEquals(60, actualArea);
    }

}
