package com.company.inheritance.task2;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String address, String name, String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;
        this.name = name;
        this.address = address;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
