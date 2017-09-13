package com.company.exercisesOnClasses;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public float getLenght() {
        return length + length + width + width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(int i) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public float getPerimeter() {
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
