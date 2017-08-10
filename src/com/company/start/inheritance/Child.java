package com.company.start.inheritance;

class Child extends Parent {
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    Child(int a, int b) {
        super(a);
        this.b = b;
    }
}
