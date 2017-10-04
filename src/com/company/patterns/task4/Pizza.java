package com.company.patterns.task4;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

     void prepare(){
         System.out.println("Preparing"+name);
         System.out.println("Tossing dough...");
         System.out.println("Adding sauce...");
         System.out.println("Adding topping");

//         for(int i =0;i<toppings.size();i++){
//             System.out.println(" "+toppings.size(i));
//         }
     }

     void bake(){
         System.out.println("Bake for 25 minutes at 350");
     }
     void cut(){
         System.out.println("Cutting pizza");
     }
     void box(){
         System.out.println("Place pizza");
     }

     public String getName(){
         return name;
     }
}
