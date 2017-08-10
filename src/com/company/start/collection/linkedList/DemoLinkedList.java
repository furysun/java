package com.company.start.collection.linkedList;


import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<>();

        ll.add("c");
        ll.add("a");
        ll.add("t");
        ll.add("D");
        ll.addLast("o");
        ll.addFirst("g");

        ll.add("A2");

        System.out.println("Исходное содержание ll"+ll);

        ll.remove("c");
        ll.remove(2);
        System.out.println("Сожержимое ll после удаления"+ll);
    }
}
