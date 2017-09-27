package com.company.start.exceptions;

public class InheritingException {
    public void f() throws  SimpleException{
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException();
    }


    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try{
            sed.f();
        } catch (SimpleException e){
            System.out.println(" Перехвачено!");
        }
    }
}
