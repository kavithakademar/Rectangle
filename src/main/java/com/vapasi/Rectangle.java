package com.vapasi;

public class Rectangle {

    private final int length;
    private final int width;
    private int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        area = length * width;
        return area;
    }
}
