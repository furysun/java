package com.company.start.exceptions.task10;

public class ForEx extends Exception {
}

class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("entrance to the first block");
        try {
            System.out.println("entrance to the first block");
            try {
                throw new ForEx();
            } finally {
                System.out.println("entrance to the two block");
            }
        } catch (ForEx e) {
            System.out.println("1");
        } finally {
            System.out.println("finally on first block");
        }
    }
}
