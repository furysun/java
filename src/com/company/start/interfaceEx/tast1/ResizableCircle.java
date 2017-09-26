package com.company.start.interfaceEx.tast1;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        return getPerimeter() * percent;
    }
}
