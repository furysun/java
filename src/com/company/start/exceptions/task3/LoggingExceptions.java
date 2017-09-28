package com.company.start.exceptions.task3;

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.out.println("intercepted" + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.out.println("intercepted" + e);
        }
    }
}
