package com.company.start.collection.arrayList;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Tom");
        customers.add("To");
        customers.add("Roo");
        customers.add("Fur");
        customers.add("Tim");

        System.out.println(customers);

        customers.remove(0);
        customers.remove(3);

        System.out.println(customers);

        customers.add("Rik");
        customers.add("Popi");
        customers.add("Rose");

        System.out.println(customers);

    }
}
