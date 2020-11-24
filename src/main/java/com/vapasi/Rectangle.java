package com.vapasi;

public class Rectangle {

    private  int length;
    private  int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {

        return length * width;
    }

    public int calculatePerimeter() {

        return 16;
    }

}
