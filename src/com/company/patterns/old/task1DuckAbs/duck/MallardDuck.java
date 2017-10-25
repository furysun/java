package com.company.patterns.old.task1DuckAbs.duck;

import com.company.patterns.old.task1DuckAbs.behavior.FlyWithWings;
import com.company.patterns.old.task1DuckAbs.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void swim() {
        System.out.println("I'm good swiming");
    }

    @Override
    public void display() {
        System.out.println("Show");
        swim();
    }
}
