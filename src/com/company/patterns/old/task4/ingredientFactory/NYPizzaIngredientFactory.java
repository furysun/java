package com.company.patterns.old.task4.ingredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheesee();
    }

    @Override
    public Veggies[] createVeggies() {
//        Veggies veggies [] = {new Garlic(), new Onion(),new Mushroom(),new RedPepperoni()};
//        return veggies;

        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
