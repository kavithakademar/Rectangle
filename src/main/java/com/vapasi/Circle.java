package com.vapasi;

public class Circle implements Shape {

    private int radius;
    private float PI = 3.14f;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return PI * radius * radius;

    }

    @Override
    public float perimeter() {
        return 2 * PI * radius;
    }
}
