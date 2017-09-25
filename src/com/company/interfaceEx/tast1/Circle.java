package com.company.interfaceEx.tast1;

import static java.lang.Math.PI;

public class Circle implements GeometricObject {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}
