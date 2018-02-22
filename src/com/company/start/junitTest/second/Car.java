package com.company.start.junitTest.second;

import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;

    private int id;
    private String color;
    private int speed;

    public void clean() {
        if (color.equals("dirty")) {
            color = "clean";
        }
    }

    public void move() {
        speed += 10;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
