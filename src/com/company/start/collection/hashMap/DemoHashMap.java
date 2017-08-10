package com.company.start.collection.hashMap;


import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> customer = new HashMap<>();

        customer.put("Tom",1);
        customer.put("Rom",2);
        customer.put("Uom",3);

        customer.clear();

        customer.put("Lom",4);
        customer.put("Gom",5);

        System.out.println(customer);

        System.out.println(customer.get("Lom"));
        System.out.println(customer.get("Tom"));
    }
}
