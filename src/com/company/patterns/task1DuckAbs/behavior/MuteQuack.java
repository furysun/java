package com.company.patterns.task1DuckAbs.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" << >>");

    }
}
