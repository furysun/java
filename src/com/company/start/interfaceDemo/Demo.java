package com.company.start.interfaceDemo;


public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Tom");
        System.out.println(cat);
        cat.eat();
        cat.speak();
        cat.move();

        dog.setName("Bob");
        System.out.println(dog);
        dog.move();
        dog.speak();
        dog.eat();
    }
}

