package com.company.start.collection;


public class Customers {
    private String name;
    private int SumOfOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumOfOrder() {
        return SumOfOrder;
    }

    public void setSumOfOrder(int sumOfOrder) {
        SumOfOrder = sumOfOrder;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", SumOfOrder=" + SumOfOrder +
                '}';
    }
}
