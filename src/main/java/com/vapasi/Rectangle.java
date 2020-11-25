package com.vapasi;

public class Rectangle implements Shape {

    private int length;
    private int width;

    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public static Rectangle createRectangle(int length, int width) {

        return new Rectangle(length, width);

    }

    public static Rectangle createSquare(int side) {

        return new Rectangle(side, side);

    }

    public float area() {

        return length * width;
    }

    public float perimeter() {

        return 2 * (length + width);
    }

}
