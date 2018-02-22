package com.company.start.junitTest.second;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void testMove() throws Exception {
        Car car = new Car();
        car.move();

        assertEquals(10,car.getSpeed());
    }

    @Test
    public void testClean() throws Exception {
        Car car = new Car();
        car.setColor("dirty");

        car.clean();

        assertEquals("clean",car.getColor());
    }
}