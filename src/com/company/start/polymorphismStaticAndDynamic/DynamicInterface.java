package com.company.start.polymorphismStaticAndDynamic;

public class DynamicInterface {
    public static void main(String[] args) {
        ITMan[] arr = new ITMan[2];
        arr[0] = new Tester();
        arr[1] = new Programmer();

        for (ITMan man : arr) {
            man.work();
        }
    }
}

interface ITMan {
    void work();
}

class Programmer implements ITMan {
    @Override
    public void work() {
        System.out.println("work");
    }
}

class Tester implements ITMan {
    @Override
    public void work() {
        System.out.println("test");
    }
}
