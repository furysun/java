package com.company.start.collection;

import java.util.LinkedList;

public class DemoShop {
    public static void main(String[] args) {
        LinkedList<String> productName = new LinkedList<>();

        Customer costomer = new Customer();

        costomer.setName("Tom");
        productName.add("Bra");
        productName.add("tootbrashers");

        productName.remove(0);
        costomer.setSumOfOrder(235);

        System.out.println(costomer + " " + productName);

        costomer.setName("Ms Mr");
        productName.add("Pen");
        productName.add("apple");
        costomer.setSumOfOrder(23);

        System.out.println(costomer + " " + productName);
    }
}
