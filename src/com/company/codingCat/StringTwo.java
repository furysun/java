package com.company.codingCat;

public class StringTwo {

    public static void main(String[] args) {
        System.out.println(mainE("wefuigf"));
        System.out.println(f("wetgtgb"));

    }



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



