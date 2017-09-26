package com.company.patterns.task1DuckAbs.duck;

import com.company.patterns.task1DuckAbs.behavior.FlyNoWay;
import com.company.patterns.task1DuckAbs.behavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
