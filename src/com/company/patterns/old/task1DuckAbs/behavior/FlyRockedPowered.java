package com.company.patterns.old.task1DuckAbs.behavior;

public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
