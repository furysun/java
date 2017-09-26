package com.company.patterns.task1DuckAbs;

import com.company.patterns.task1DuckAbs.duck.Duck;
import com.company.patterns.task1DuckAbs.duck.MallardDuck;

public class TestDuck {
    public static void main(String[] args) {
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();
    }
}
