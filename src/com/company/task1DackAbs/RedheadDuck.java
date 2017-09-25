package com.company.task1DackAbs;

public class RedheadDuck extends Duck {
    @Override
    void quack() {
        System.out.println("Krayyy-krayyy. I'm an annoying duck quack ");
    }

    @Override
    void swim() {
        System.out.println("I swim slowly because I'm a lazy duckling");
    }

    @Override
    void display() {
        System.out.println();
        System.out.println("Beautiful RedheadDuck: ");
        quack();
        swim();
    }
}
