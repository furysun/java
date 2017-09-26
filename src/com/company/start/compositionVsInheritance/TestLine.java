package com.company.start.compositionVsInheritance;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
//        LineSub l = new LineSub(2,3);



        System.out.println(l1);

        Point p1 = new Point(5,9);
        Point p2 = new Point(6, 7);
        LineSub l = new LineSub(p1, p2);
        System.out.println(l);
        System.out.println(l);
    }

}

