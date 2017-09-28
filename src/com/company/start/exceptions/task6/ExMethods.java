package com.company.start.exceptions.task6;

public class ExMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("my exception");
        }catch (Exception e){
            System.out.println("catch");
            System.out.println("getMess(): "+e.getMessage());
            System.out.println("getLocalizedMess(): "+e.getLocalizedMessage());
            System.out.println("toString: "+e);
            System.out.println("PrintStackTrace: ");
        }
    }
}
