package com.company.start.collection.myCollection.list2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArryListTwo<T> implements MyListTwo<T> {
    public static final int CAPACITY = 10;
    private T[] array;
    private int size;
    private Iterator<T> iterator = new MyArryListTwoIterator<>();

    public MyArryListTwo() {
        array = (T[]) new Object[CAPACITY];
    }


    @Override
    public void add(T elem) {
        if (array.length == size) {
            T[] newArray = (T[]) new Object[size + CAPACITY];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = elem;
        size++;
    }

    @Override
    public void remove(T elem) {
        T[] newArray = (T[]) new Object[array.length];
        int newArrayIndex = 0;
        for (int i = 0; i < array.length; i++, newArrayIndex++) {
            if (array[i] == elem) {
                i++;
            }
            newArray[newArrayIndex] = array[i];
        }
        array = newArray;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }

    class MyArryListTwoIterator<V> implements Iterator<V> {
        private int current;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public V next() {
            return (V) array[current++];
        }
    }
}

class DemoTest {
    public static void main(String[] args) {
        MyListTwo<Integer> myListTwo = new MyArryListTwo<>();

        myListTwo.add(1);
        myListTwo.add(2);
        myListTwo.add(3);
        myListTwo.add(4);

        myListTwo.remove(2);

        myListTwo.print();

        for (Integer elem : myListTwo) {
            System.out.println(elem);
        }

    }
}



