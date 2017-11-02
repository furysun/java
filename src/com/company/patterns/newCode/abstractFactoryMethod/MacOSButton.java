package com.company.patterns.newCode.abstractFactoryMethod;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }

}
