package com.company.exercisesOnClasses.task1;

import com.company.exercisesOnClasses.task1.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println("My get:  "+rectangle.getArea()+" "+
        rectangle.getPerimeter()+" "+
        rectangle.getLenght()+" "+
        rectangle.getWidth());
    }
}
