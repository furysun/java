package com.company.composition.task2;

import static java.lang.Math.PI;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {

    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double getCicumference() {
        return PI * PI;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
