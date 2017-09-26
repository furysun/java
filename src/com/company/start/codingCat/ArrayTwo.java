package com.company.start.codingCat;

public class ArrayTwo {
    public static void main(String[] args) {
        print1(fizzArray(5));
    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean has77(int[] nums) {
        boolean containsSeven = false;
        boolean containsSevenTwo = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                containsSeven = true;
            }

            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
                containsSevenTwo = true;

            }
        }
        return containsSeven || containsSevenTwo;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int a = Math.abs(nums1[i] - nums2[i]);
            if (a == 1 || a == 2) {
                count++;
            }
        }
        return count;
    }

    public boolean either24(int[] nums) {
        boolean containsTwo = false;
        boolean containsFour = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                containsTwo = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                containsFour = true;
            }
            if (containsTwo && containsFour) {
                return false;
            }
        }
        return containsTwo || containsFour;
    }

    public boolean no14(int[] nums) {
        boolean containsOne = false;
        boolean containsFour = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                containsOne = true;
            }
            if (nums[i] == 4) {
                containsFour = true;
            }
        }
        return !containsFour || !containsOne;

    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void print1(int[] array) {
        for (int elem : array) {
            System.out.println(elem + " ");
        }
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
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
