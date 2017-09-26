package com.company.task1DuckAbs.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
    }

    @Override
    public void swim() {
        System.out.println("M");

    }

    @Override
    public void display() {
        System.out.println("Mlhj,");
        swim();
    }


}
