package com.company.patterns.task4;

public class NYSyleCheesePizza extends Pizza {
    public NYSyleCheesePizza() {
        name = "NY Syle Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("NY Pizza");
    }

    @Override
    public void prepare() {

    }
}
