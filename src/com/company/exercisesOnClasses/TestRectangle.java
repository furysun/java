package com.company.exercisesOnClasses;

public class TestRectangle {
    public static void main(String[] args) {
        SimplifiedRectangle rectangle = new SimplifiedRectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println("My get:  "+rectangle.getArea()+" "+
        rectangle.getPerimeter()+" "+
        rectangle.getLenght()+" "+
        rectangle.getWidth());
    }
}
