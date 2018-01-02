package com.company.start.collection.myCollection.list;

public interface MyList<T> extends Iterable<T>{
    void add(T element);

    void remove(T element);

    int size();

    void print();

    boolean contains(T element);
}
