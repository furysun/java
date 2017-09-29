package com.company.start.exceptions.task9;

public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = false;
        System.out.println(this);
    }


    public void off() {
        state = true;
        System.out.println(this);
    }

    public String toString() {
        return state ? "off" : "on";
    }
}

class OnOffEx1 extends Exception {

}

class OnOffEx2 extends Exception {

}

class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f()
            throws OnOffEx1, OnOffEx2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffEx1 e) {
            System.out.println("OnOffEx2");
            sw.off();
        } catch (OnOffEx2 e) {
            System.out.println("OnOffEx2");
            sw.off();
        }
    }
}


