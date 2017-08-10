package com.company.start.collection.arrayWrapper;


public class ArrayDemo {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.put(0,2);
        array.put(1,4);
        array.put(2,5);
        array.put(3,8);
        array.put(4,7);

        array.print();
        System.out.println(array.lenght());
    }
}

