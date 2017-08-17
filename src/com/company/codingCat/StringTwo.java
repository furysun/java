package com.company.codingCat;

public class StringTwo {

    public static void main(String[] args) {
        String s = "afghkkrukg";

    }

    public String minCat(String a, String b) {
        int amin = a.length();
        int bmin = b.length();
        if (a.equals("")) {
            return a;
        }
        if (b.equals("")) {
            return b;
        }
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - amin);
        }

        if (b.length() < a.length()) {
            return b + a.substring(a.length() - bmin);
        }
        return a;
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    public String seeColor(String str) {
        if (str.length() < 4 && !str.equals("red")) {
            return "";
        }
        if (str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2 || str.equals("")) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.equals("")) {
            return b;
        }
        if (b.equals("")) {
            return a;
        }

        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }


    public String lastChars(String a, String b) {

        if (a.equals("") && b.equals("")) {
            return "@@";
        }
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }
        if (a.equals("")) {
            return "@" + b.substring(b.length() - 1);
        } else {
            return a.substring(0, 1) + "@";
        }

    }

    public String atFirst(String str) {
        if (str.equals("")) {
            return "@@";
        }

        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str + "@";
        }
    }

    public static boolean hasBad(String str) {

        return str.length() > 2 && str.substring(0, 3).equals("bad") || str.length() > 3 && str.substring(1, 4).equals("bad");
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }


    public String withoutX(String str) {
        char[] c = str.toCharArray();
        if (c[0] == 'x') {
            return str.substring(0);
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX1(String str) {


        if (str.length() > 3) {

            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length() - 1);
            } else {
                if (str.charAt(0) == 'x') {
                    return str.substring(1);
                }
                if (str.charAt(str.length() - 1) == 'x') {
                    return str.substring(0, str.length() - 1);
                }
            }
        }
        return str;
    }

    public String withoutX12(String str) {
        String result = "";

        if (str.charAt(0) == 'x') {
            result = str.substring(1);
        }
        if (str.charAt(str.length() - 1) == 'x') {
            result = result.substring(0, str.length() - 2);
        }

        return result;

    }


    public String withoutX123(String str) {
        String result = "";
        if (str.length() > 3) {

            if (str.charAt(0) == 'x') {
                result = str.substring(1);
            }
            if (str.charAt(str.length() - 1) == 'x') {
                return result.substring(0, str.length() - 2);
            }
        } else {

        }
        return str;


    }

    public String twoChar(String str, int index) {
        if (str.length() >= 2 && index < str.length() - 1 && index > 0) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }


    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String theEnd(String str, boolean front) {

        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String right2(String str) {
        if (str.length() < 1) {
            return str;
        } else {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
    }

    public String left2(String str) {
        if (str.length() < 1) {
            return str;
        } else {
            return str.substring(2) + str.substring(0, 2);
        }
    }


    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    //
    public static String m(String str) {

        if (str.length() > 3 || !str.contains("o")) {

            return str.substring(str.length() / 2);
        } else {

            return str;
        }
    }


    public static String mainE(String s) {
        if (s.length() > 2) {
            String s1 = s.substring(s.length() - 2);
            return s1 + s1 + s1;
        } else {
            return s;
        }

    }

    public static String f(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }
    
}



