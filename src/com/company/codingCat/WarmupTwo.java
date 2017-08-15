package com.company.codingCat;


public class WarmupTwo {
    public static void main(String[] args) {

    }

    public String stringBits(String str) {
        String result = "";
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i += 2) {

                result += str.charAt(i);
            }
        }

        return result;
    }

    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str;
        }

        return s;
    }


    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                s += str;
            }
        } else {
            for (int i = 0; i < n; i++) {
                s += str.substring(0, 3);

            }
        }

        return s;
    }


    boolean countXX4(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }

        return false;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                return true;
            }
        }
        return false;
    }
}
