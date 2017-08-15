package com.company.codingCat;

public class ArrayTwo {
    public static void main(String[] args) {
        int[] c = new int[]{1, 1, 5, 5, 10, 8, 7};
//        countEvens(c);
        System.out.println(centeredAverage(c));
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                ignore = true;
            }
            if (!ignore) {
                sum += nums[i];
            }
            if (nums[i] == 7) {
                ignore = false;
            }
        }
        return sum;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }


    public static int centeredAverage(int[] nums) {
        int min = 0;
        int max = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        System.out.println(max + " " + min);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != min && i != max) {
                sum += nums[i];
            }
        }
        return sum / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }
        return sum;
    }

    public static int countEvens(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
