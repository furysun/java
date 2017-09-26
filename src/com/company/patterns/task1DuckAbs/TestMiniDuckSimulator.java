package com.company.patterns.task1DuckAbs;

import com.company.patterns.task1DuckAbs.behavior.FlyRockedPowered;
import com.company.patterns.task1DuckAbs.duck.Duck;
import com.company.patterns.task1DuckAbs.duck.MallardDuck;

public class TestMiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
