package com.company.task1DackAbs;

public class MallardDuck extends Duck {
    @Override
    void quack() {
        System.out.println("kray");
    }

    @Override
    void swim() {
        System.out.println("fast duck");
    }

    @Override
    void display() {
        System.out.println();
        System.out.println("MallardDuck: ");
        quack();
        swim();
    }
}
