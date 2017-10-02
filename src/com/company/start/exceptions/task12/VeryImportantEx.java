package com.company.start.exceptions.task12;

public class VeryImportantEx extends Exception {
    public String toString() {
        return "a very important exception";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "built-in exception";
    }
}

class LostMessage {
    void f() throws VeryImportantEx {
        throw new VeryImportantEx();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
