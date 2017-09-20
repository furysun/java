package com.company.abstractClass;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public  Rectangle(double a,double b,String color, boolean e){

    }

    public double getLenght() {
        return length + length + width + width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int i) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}

