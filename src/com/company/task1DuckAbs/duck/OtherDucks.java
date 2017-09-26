package com.company.task1DuckAbs.duck;

public class OtherDucks extends Duck {




    @Override
    public void swim() {
        System.out.println("O");
    }

    @Override
    public void display() {
        System.out.println("O");
        swim();
    }


}
