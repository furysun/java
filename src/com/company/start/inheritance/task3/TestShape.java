package com.company.start.inheritance.task3;

import com.company.start.exercisesOnClasses.task1.Circle;
import com.company.start.exercisesOnClasses.task1.Rectangle;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        square.setColor("blue");
        square.setFilled(true);

        circle.setColor("green");
        circle.setFilled(true);

        rectangle.setColor("blue");
        rectangle.setFilled(true);

        System.out.println(square.getColor());
        System.out.println(square.getArea());


        System.out.println(circle.getColor());
        System.out.println(circle.getArea());

        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getArea());
    }
}
