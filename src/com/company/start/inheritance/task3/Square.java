package com.company.start.inheritance.task3;

import com.company.start.exercisesOnClasses.task1.Rectangle;

public class Square extends Rectangle {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }



    public void setSide(double side) {
        this.side = side;
    }

}
