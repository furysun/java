package com.company.start.arrayAndIf;

public class ArrayAndIfDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};

        for (int element : array) {
            element = 2;
            System.out.println(element);
        }

        int[] arr = new int[10];

        for(int i =0; i<arr.length;i++){
            if(i == 3){
                System.out.print("3 ");
            }

            if (i < 3){
                System.out.print("< ");
            } else {
                System.out.print("& ");
            }
        }
    }

}
