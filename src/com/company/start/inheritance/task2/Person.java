package com.company.start.inheritance.task2;

public class Person {
    public String  name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
