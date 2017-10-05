package com.company.patterns.task4.ingredientFactory;

import com.company.patterns.task4.Pizza;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        Veggies[] veggies = ingredientFactory.createVeggies();
    }
}
