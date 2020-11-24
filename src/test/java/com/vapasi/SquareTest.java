package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnAreaNineForSquareOfSideThree()  {
        Square square = new Square(3);
        int actualArea = square.area();
        assertEquals(9, actualArea);
    }

}
