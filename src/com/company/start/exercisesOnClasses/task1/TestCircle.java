package com.company.start.exercisesOnClasses.task1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("blue");
        System.out.println(" my two PI: " + c4.getCicumference());

        System.out.println("color is: " + c4.getColor());
        System.out.println(c4.setRadius(4.0));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c2);
    }
}
