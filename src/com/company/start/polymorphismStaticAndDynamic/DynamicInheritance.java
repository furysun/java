package com.company.start.polymorphismStaticAndDynamic;

public class DynamicInheritance {
    public static void main(String[] args) {

        ITMann[] arr = new ITMann[2];
        arr[0] = new ITMann();
        arr[1] = new Programmerr();

        for (ITMann man : arr) {
            man.work();
        }

    }
}

class ITMann {
    public void work() {
        System.out.println("not works");
    }
}

class Programmerr extends ITMann {
    @Override
    public void work() {
        System.out.println("work");
    }
}
