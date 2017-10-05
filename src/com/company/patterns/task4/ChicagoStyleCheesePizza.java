package com.company.patterns.task4;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("S Mozzarella Ch");
    }

    @Override
    public void prepare() {
        System.out.println("ChicagoStyleCheesePizza");
    }

//    void cut(){
//        System.out.println("Cutting the pizza ChicagoSsePizza");
//    }
}
