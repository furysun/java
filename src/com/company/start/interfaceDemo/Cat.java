package com.company.start.interfaceDemo;

public class Cat implements Alive {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }

    @Override
    public void speak() {
        System.out.println("may-may");
    }

    @Override
    public String toString() {
        return "Cat " +
                "name = " + name ;
    }
}
