package com.company.start.composition.task3;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice() {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCostomerName(){
        return customer.getName();
    }

    public double getAmountAfterDiscount(){
        return (amount * 100) / 20;
    }

}
