package com.company.patterns.task1DuckAbs;

import com.company.patterns.task1DuckAbs.behavior.FlyRockedPowered;
import com.company.patterns.task1DuckAbs.duck.Duck;
import com.company.patterns.task1DuckAbs.duck.MallardDuck;

public class TestMiniDuckSimulator {
    public static void main(String[] args) {
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();

        System.out.println();

        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
