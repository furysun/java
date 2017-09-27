package com.company.start.exceptions.task2;

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println(" Use MyException f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println(" Use MyException g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

