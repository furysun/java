package com.company.start.swapVariable;

public class SwapVarible {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);

        System.out.println("Without a third variable.");
        int d = 4;
        int e = 1;

        d = d + e;
        e = d - e;
        d = d - e;

        System.out.println(d + " " + e);
    }
}
