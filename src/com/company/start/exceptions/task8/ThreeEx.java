package com.company.start.exceptions.task8;

public class ThreeEx extends Exception {
}

class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new ThreeEx();
                System.out.println("there are no exceptions ");
            } catch (ThreeEx e) {
                System.out.println("ThreeEx");
            } finally {
                {
                    System.out.println(" from block finally");
                    if (count == 2) break;
                }
            }
        }
    }
}