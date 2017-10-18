package com.company.patterns.task5;

public class Test {
    public static void main(String[] args) {
        ChoocolateBoirler boirler = ChoocolateBoirler.getInstance();
       boirler.fill();
       boirler.boil();
       boirler.drain();
    }
}
