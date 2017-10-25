package com.company.patterns.old.task5;

public class ChoocolateBoirler {
    private boolean empty;
    private boolean boiled;

    private static ChoocolateBoirler uniqueInstancel;

    public boolean isEmpty() {
        return empty;
    }


    public static ChoocolateBoirler unigueInstance;

    public boolean isBoiled() {
        return boiled;
    }

    public static ChoocolateBoirler getInstance() {
        if (unigueInstance == null) {
            unigueInstance = new ChoocolateBoirler();
        }
        return unigueInstance;
    }

    private ChoocolateBoirler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        System.out.println("the heater is empty");
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (isEmpty() && isBoiled()) {
            System.out.println("The mixture was brought to a boil\n");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("heated.");
        }
    }

}
