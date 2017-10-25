package com.company.patterns.old.task5;

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
