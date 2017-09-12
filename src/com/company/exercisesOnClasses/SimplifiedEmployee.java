package com.company.exercisesOnClasses;

public class SimplifiedEmployee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public SimplifiedEmployee() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnuaSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return (salary * 100) / percent;
    }

    @Override
    public String toString() {
        return "SimplifiedEmployee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
