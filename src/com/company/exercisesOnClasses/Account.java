package com.company.exercisesOnClasses;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account() {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        return amount + balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance - amount;
        } else {
            System.out.println(" Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            return balance;
        } else {
            System.out.println("Awmount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
