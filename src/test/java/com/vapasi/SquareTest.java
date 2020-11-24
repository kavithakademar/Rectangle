package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shoulReturnAreaForGivenSide()  {
        Square square = new Square(10);
        int actualArea = square.area();
        assertEquals(100, actualArea);
    }
    @Test
    public void shouldReturnPerimeterForGivenSide() {
        Square square = new Square(15);
        int actualArea = square.perimeter();
        assertEquals(100, actualArea);
    }

}
