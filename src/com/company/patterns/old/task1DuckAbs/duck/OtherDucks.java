package com.company.patterns.old.task1DuckAbs.duck;

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
