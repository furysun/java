package com.company.start.junitTest.second;

import java.util.List;

public class Robot {
    public Car buildCar(Engine engine, List<Wheel> wheels) {
        Car car = new Car();
        car.setEngine(engine);
        car.setWheels(wheels);

        return car;
    }

    public Car paintCar(Car car, String color) {
        car.setColor(color);
        return car;
    }
}
