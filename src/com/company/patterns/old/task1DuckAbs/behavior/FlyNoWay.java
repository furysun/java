package com.company.patterns.old.task1DuckAbs.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Don't fly");
    }
}
