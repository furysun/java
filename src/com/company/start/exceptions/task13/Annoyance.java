package com.company.start.exceptions.task13;

public class Annoyance extends Exception {

}

class Sneeze extends Annoyance {
}

class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("catch Sneeze");
        } catch (Annoyance a) {
            System.out.println("catch Annoyance");
        }
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("catch Annoyance");
        }
    }
}
