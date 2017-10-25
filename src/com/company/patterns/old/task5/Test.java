package com.company.patterns.old.task5;

public class Test {
    public static void main(String[] args) {
        ChoocolateBoirler boirler = ChoocolateBoirler.getInstance();
       boirler.fill();
       boirler.boil();
       boirler.drain();
    }
}
