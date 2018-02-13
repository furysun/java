package com.company;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public int minus(int a, int b) {
        int difference = a - b;
        return difference;
    }
}
