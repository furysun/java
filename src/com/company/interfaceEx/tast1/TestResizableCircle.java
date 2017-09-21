package com.company.interfaceEx.tast1;

public class TestResizableCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3);
        System.out.println(resizableCircle.resize(2));
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
    }
}
