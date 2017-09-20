package com.company.abstractClass;

import static java.lang.Math.PI;

public class Square extends Rectangle {

    private double side;


    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
    }

    public Square(float l, float w) {
        super(l, w);
    }

    public Square(double side,String color,boolean filled){

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
