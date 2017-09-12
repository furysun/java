package com.company.exercisesOnClasses;

public class TestCircle {
    public static void main(String[] args) {
        SimplifiedCircle c1 = new SimplifiedCircle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        SimplifiedCircle c2 = new SimplifiedCircle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        SimplifiedCircle c4 = new SimplifiedCircle();
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
