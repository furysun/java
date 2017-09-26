package com.company.task1DackAbs;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {

    }

//    public void setFlyBehavior(FlyBehavior fb){
//        flyBehavior = fb;
//    }

//    public abstract void swim();
public void swim(){
    System.out.println("swimmm");
}
    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
