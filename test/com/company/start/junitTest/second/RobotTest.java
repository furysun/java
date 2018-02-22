package com.company.start.junitTest.second;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RobotTest {
    @Test
    public void testBuildCar() throws Exception {
        Robot robot = new Robot();

        Engine engine = new Engine();
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel());

        Car car = robot.buildCar(engine, wheels);

        assertEquals(engine, car.getEngine());
        assertEquals(wheels, car.getWheels());
    }

    @Test
    public void testPainCar() throws Exception {
        Robot robot = new Robot();
        Car car = new Car();

        Car result = robot.paintCar(car, "red");

        assertEquals("red", result.getColor());
    }
}