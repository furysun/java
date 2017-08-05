package com.company.start;

public class LoopDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(" *");
        }

        System.out.println();
        int a = 9;
        for (int i = 0; i < a; i++) {
            System.out.print(" " + i);
        }

        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.print(" mrr");
            i++;
        }

        System.out.println();
        System.out.print("for each : ");
        int[] array = new int[]{1, 2, 3};

        for (int element : array) {
            element = 1;
            System.out.print(" " + element);
        }
    }
}
