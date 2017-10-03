package com.company.patterns.task3;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return .35;
    }
}
