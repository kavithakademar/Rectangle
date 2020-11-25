package com.vapasi;

import java.text.DecimalFormat;

public class Shape {

    private int length;
    private int width;
    private boolean isCircle = false;
    private int radius ;
    private float PI = 3.14f ;

    private Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private Shape(int radius)  {
        isCircle = true;
        this.radius = radius;
    }

    public static Shape createRectangle(int length, int width) {

        return new Shape(length,  width);

    }
    public static Shape createSquare(int side) {

        return new Shape(side, side);

    }
    public static Shape createCircle(int radius) {
        return new Shape(radius);
    }

    public float area() {
        if(isCircle) return PI * radius * radius;
        return length * width;
    }

    public float perimeter() {
        if(isCircle){
            return 2 * PI * radius;
        }
         return 2 * (length + width);
    }

}
