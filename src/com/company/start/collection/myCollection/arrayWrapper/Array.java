package com.company.start.collection.myCollection.arrayWrapper;


public class Array {
    private int[] array;

    public Array(int size){
        this.array = new int[size];
    }

    public Array(int[]array){
        this.array = array;
    }

    public void put(int index, int value){
        array[index] = value;
    }

    public int get(int index){
        return array[index];
    }

    public  void print() {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public int length(){
        return array.length;
    }
}


