package com.company.start.collection.myCollection.list2;

public class MyArryListTwo implements MyListTwo {
    public static final int CAPACITY = 10;
    private int[] array;
    private int size;

    public MyArryListTwo() {
        array = new int[10];
    }


    @Override
    public void add(int elem) {
        if (array.length == size){
            int[] newArray = new int[size+CAPACITY];

            for (int i= 0;i<array.length;i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = elem;
        size++;
    }

    @Override
    public void remove(int elem) {
        int[] newArray = new int[array.length];
        int newArrayIndex = 0;
        for (int i = 0; i < array.length; i++, newArrayIndex++) {
          if(array[i] == elem){
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
}

class D {
    public static void main(String[] args) {
        MyListTwo myListTwo = new MyArryListTwo();
        myListTwo.add(1);
        myListTwo.add(2);
        myListTwo.add(3);
        myListTwo.add(4);

        myListTwo.remove(2);

        myListTwo.print();
    }
}



