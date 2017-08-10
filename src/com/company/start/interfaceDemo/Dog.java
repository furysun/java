package com.company.start.interfaceDemo;


public class Dog implements Alive {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public void speak() {
        System.out.println("wow-bow");
    }

    @Override
    public String toString() {
        return "Dog " +
                "name = " + name;
    }
}
