package com.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    Circle circle;
    @Test
    public void shouldReturnAreaOfCircleForGivenRadius() {

        circle = new Circle(10);
        float actualArea = circle.area();
        assertEquals(314, actualArea, 0.001);
    }

    @Test
    public void shouldReturnPerimeterOfCircleForGivenRadius() {

        circle = new Circle(5);
        float actualPerimeter = circle.perimeter();
        assertEquals(31.4, actualPerimeter, 0.001);
    }

}
