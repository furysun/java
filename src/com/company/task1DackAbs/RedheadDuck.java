package com.company.task1DackAbs;

public class RedheadDuck extends Duck {



    @Override
    public void swim() {
        System.out.println("r");
    }

    @Override
    public void display() {
        System.out.println("r");
        swim();

    }


}
