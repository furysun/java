package com.company.start.exceptions.rethrowingExceptions;

public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("create f() ");
        throw new Exception("caused by");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("in the method g(), e.printStackTrace");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("in the method f(), e.printStackTrace");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();

        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStack");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStack ");
            e.printStackTrace(System.out);
        }
    }
}
