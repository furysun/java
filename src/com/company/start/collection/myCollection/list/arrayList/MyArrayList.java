package com.company.start.collection.myCollection.list.arrayList;

import com.company.start.collection.myCollection.list.MyList;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    public static final int CAPACITY = 10;
    private T[] array;
    private int size;
    private Iterator<T> iterator = new MyArrayListIterator<>();

    MyArrayList() {
        array = (T[]) new Object[CAPACITY];
    }

    @Override
    public void add(T element) {
        if (array.length == size) {
            T[] newArray = (T[]) new Object[size + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            array = newArray;
        }

        array[size] = element;
        size++;
    }

    @Override
    public void remove(T element) {
        if (contains(element)) {
            T[] newArray = (T[]) new Object[array.length];
            boolean removed = false;
            for (int i = 0, j = 0; i < array.length; i++, j++) {
                if (array[i] == element && !removed) {
                    i++;
                    removed = true;
                }
                newArray[j] = array[i];
            }
            array = newArray;
        }
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
    public boolean contains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return iterator;
    }

    class MyArrayListIterator<V> implements Iterator<V> {
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

class Demo {
    public static void main(String[] args) {
        MyList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("f");
        myArrayList.add("w");
        myArrayList.add("d");

//        myArrayList.remove(5);
//        myArrayList.print();

        for (String elem : myArrayList) {
            System.out.println(elem);
        }
    }
}