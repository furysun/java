package com.company.start.exceptions.task5;

import com.company.start.exceptions.task2.MyException;

public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println(" MyEx2 f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("MyEx2 g()");

        throw new MyException2("create in g");
    }

    public static void h() throws MyException2 {
        System.out.println("MyEx2 h()");

        throw new MyException2("create in h");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try{
            h();
        }catch(MyException2 e){
            e.printStackTrace(System.out);
            System.out.println("e.val() = "+e.val());
        }
    }
}
