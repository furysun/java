package com.company.start.exceptions.task7RuntimeEx;

public class NeverCaught {
    static void f() {
        throw new RuntimeException("Form f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
