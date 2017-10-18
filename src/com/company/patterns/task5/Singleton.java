package com.company.patterns.task5;

public class Singleton {
    private static Singleton uniqueInstance;

    public Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
