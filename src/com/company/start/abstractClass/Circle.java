package com.company.start.abstractClass;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;

    public Circle(double a, String color, boolean y) {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
