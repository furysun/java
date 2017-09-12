package com.company.exercisesOnClasses;

public class TestEmployee {
    public static void main(String[] args) {
        SimplifiedEmployee employee = new SimplifiedEmployee();
        employee.setSalary(578);

        System.out.println(
        employee.getAnnuaSalary()+" "+
        employee.raiseSalary(12));
    }
}
