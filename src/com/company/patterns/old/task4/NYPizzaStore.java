package com.company.patterns.old.task4;

import com.company.patterns.old.task4.ingredientFactory.*;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York St Ch Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York St Ch Pizza");
        } else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Clam Pizza");
        } else if(item.equals("pepperoni")){
//            pizza = new Pepperoni(ingredientFactory);
            pizza.setName("Pepperoni Pizza");
        }
        return pizza;
    }
}
