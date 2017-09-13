package com.company.exercisesOnClasses;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double setRadius(double newRadius) {
        return this.radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public double getCicumference() {
        return PI * PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
