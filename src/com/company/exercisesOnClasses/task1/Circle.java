package com.company.exercisesOnClasses.task1;

import com.company.inheritance.task3.Shape;

import static java.lang.Math.PI;

public class Circle extends Shape{
    public double radius;
    public String color;
    private int side;

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
        return "Cylinder[radius=" + radius + " color=" + color + "]";
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
