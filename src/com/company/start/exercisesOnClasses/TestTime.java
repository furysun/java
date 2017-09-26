package com.company.start.exercisesOnClasses;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time();

        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);
        System.out.println(time.previousSecond());
        System.out.println(time.getHour()+" "+time.getMinute()+" "+ time.getSecond()+" "+ time.nextSecond());
    }
}
