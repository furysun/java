package com.company.exercisesOnClasses;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;

    }

    public Time previousSecond() {
        if (second ==1 ) {
            second = 0;
            second--;

            if (minute == 1) {
                minute = 0;
                minute--;
                if (hour == 1) {
                    hour = 0;
                    hour--;
                }
            }
        }

        return this;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
