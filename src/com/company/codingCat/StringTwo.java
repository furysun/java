package com.company.codingCat;

public class StringTwo {

    public static void main(String[] args) {
        System.out.println(mainE("wefuigf"));
        System.out.println(f("wetgtgb"));

    }

//    public String middleTwo(String str) {
//
//    }

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



