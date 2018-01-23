package com.company.start.collection.myCollection.list.linkedList;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T element) {
        value = element;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
