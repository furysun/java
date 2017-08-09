package com.company.start.switch1;

public class Switch1 {
    public static void main(String[] args) {
        String s = "d";

        switch (s) {
            case "s":
                System.out.println("s");
                break;

            case "d":
                System.out.println("d");
                break;

            case "v":
                System.out.println("v");
                break;
        }

        if (s.equals("s")) {
            System.out.println("s");
        } else if (s.equals("d")) {
            System.out.println("d");
        } else if (s.equals("v")) {
            System.out.println("v");
        }
    }
}
