package com.company.task1DuckAbs;

import com.company.task1DuckAbs.duck.Duck;
import com.company.task1DuckAbs.duck.MallardDuck;

public class TestDuck {
    public static void main(String[] args) {
        Duck m = new MallardDuck();
        m.performQuack();
        m.performFly();
    }
}
