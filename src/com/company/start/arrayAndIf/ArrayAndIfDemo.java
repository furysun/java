package com.company.start.arrayAndIf;

public class ArrayAndIfDemo {
    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 3};
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 2;
//        }
//        print(array);
//        System.out.println();
//
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 3) {
//                System.out.print("3 ");
//            }
//
//            if (i < 3) {
//                System.out.print("< ");
//            } else {
//                System.out.print("& ");
//            }
//        }

        int[] array = new int[10];
        int[] result = printOne(array);
        print(result);
    }

    public static int[] printOne(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int element : arr) {

            System.out.print(element + " ");
        }
        System.out.println("]");
    }

}
