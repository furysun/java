package com.company.patterns.task4;

import com.company.patterns.task4.ingredientFactory.Cheese;
import com.company.patterns.task4.ingredientFactory.Clams;
import com.company.patterns.task4.ingredientFactory.Pepperoni;
import com.company.patterns.task4.ingredientFactory.Veggies;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    ArrayList toppings = new ArrayList();

//     void prepare(){
//         System.out.println("Preparing"+name);
//         System.out.println("Tossing dough...");
//         System.out.println("Adding sauce...");
//         System.out.println("Adding topping");
//
//         for(int i =0;i<toppings.size();i++){
//             System.out.println(" "+toppings.size(i));
//         }
//     }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Place pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                ", toppings=" + toppings +
                '}';
    }
}
