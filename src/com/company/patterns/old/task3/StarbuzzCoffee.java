package com.company.patterns.old.task3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
