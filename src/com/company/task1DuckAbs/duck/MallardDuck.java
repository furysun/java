package com.company.task1DuckAbs.duck;

import com.company.task1DuckAbs.behavior.FlyWithWings;
import com.company.task1DuckAbs.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
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
