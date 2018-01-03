package com.company.start.collection.myCollection.list2;

public interface MyListTwo<T> extends Iterable<T> {
    void add(T elem);

    void remove(T elem);

    int size();

    void print();

}
