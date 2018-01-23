package com.company.start.collection.myCollection.list.linkedList;

import com.company.start.collection.myCollection.list.MyList;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private int size;

    @Override
    public void add(T element) {
        if (first == null) {
            first = new Node<>(element);
        } else {
            Node<T> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            Node<T> newNode = new Node<>(element);
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(T element) {
        if (contains(element)) {
            Node<T> current = first;
            while (current.getNext() != null) {
                if (current.getNext().getValue() == element) {
//                    return true;
                    current.setNext(current.getNext().getNext());
                }
                current = current.getNext();
            }
            size--;

        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        Node<T> current = first;
        while (current.getNext() != null) {
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println(current);
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = first;
        while (current.getNext() != null) {
            if (current.getValue() == element) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index == 0) {
            return first.getValue();
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator<>();
    }

    class MyLinkedListIterator<V> implements Iterator<V> {
        private Node<T> current;

        @Override
        public boolean hasNext() {
            if (current == null) {
                return true;
            } else {
                return current.getNext() != null;
            }
        }

        @Override
        public V next() {
            if (current == null) {
                current = first;
                return (V) current.getValue();
            }

            current = current.getNext();
            return (V) current.getValue();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MyList<String> myList = new MyLinkedList<>();

        myList.add("sdf");
        myList.add("cat");
        myList.add("sdf1");

//        myList.remove("cat");
//        myList.print();
//
//        System.out.println(myList.size());
//        System.out.println(myList.contains("cat"));
//        System.out.println(myList.get(1));

        for (String el : myList) {
            System.out.println(el);
        }
    }
}
