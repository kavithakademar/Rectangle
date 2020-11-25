package com.vapasi;

public class Shape {

    private int length;
    private int width;


    private Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static Shape createRectangle(int length, int width) {

        return new Shape(length,  width);

    }
    public static Shape createSquare(int side) {

        return new Shape(side, side);

    }
    public int area() {

        return length * width;
    }

    public int perimeter() {

        return 2 * (length + width);
    }

}
