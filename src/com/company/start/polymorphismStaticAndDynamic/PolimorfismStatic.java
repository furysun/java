package com.company.start.polymorphismStaticAndDynamic;

public class PolimorfismStatic {
    void sum(int a,int b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]) {
        PolimorfismStatic obj=new PolimorfismStatic();
        obj.sum(10,10,10);
        obj.sum(20,20);
    }
}
