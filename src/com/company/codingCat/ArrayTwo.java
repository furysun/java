package com.company.codingCat;

public class ArrayTwo {
    public static void main(String[] args) {

    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
        }
        return sum;
    }


    public boolean commonEnd(int[] a, int[] b) {
        if (a.length < 1 || b.length < 1) {
            return false;
        }
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
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
