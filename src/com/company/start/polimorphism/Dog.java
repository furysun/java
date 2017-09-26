package com.company.start.polimorphism;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Wow-bow");
    }

    public void greeting(Dog another) {
        System.out.println("Woooff!!!");
    }
}
