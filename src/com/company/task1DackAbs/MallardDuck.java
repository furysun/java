package com.company.task1DackAbs;

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
