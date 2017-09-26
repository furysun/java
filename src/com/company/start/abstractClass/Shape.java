package com.company.start.abstractClass;

public abstract class Shape {
    private String color;
    private boolean filled;
    private int radius;
    private boolean length;
    private boolean side;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getArea() {
        return getArea();
    }

    public double getPerimeter() {
        return getPerimeter();
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean getLength() {
        return length;
    }

    public boolean getSide() {
        return side;
    }
}
