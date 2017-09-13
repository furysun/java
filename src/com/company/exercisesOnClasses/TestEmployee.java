package com.company.exercisesOnClasses;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(578);

        System.out.println(
                employee.getAnnuaSalary() + " " +
                        employee.raiseSalary(12));
    }
}
