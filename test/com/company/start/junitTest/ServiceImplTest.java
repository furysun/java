package com.company.start.junitTest;

import com.company.start.junitTest.first.Service;
import com.company.start.junitTest.first.ServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceImplTest {
    private Service service = new ServiceImpl();

    @Test
    public void testIsEven() throws Exception {
        assertTrue(service.isEven(4));
    }

    @Test
    public void testIsEvenFalse() throws Exception {
        assertFalse(service.isEven(5));
    }

    @Test
    public void testSum() throws Exception {
        int actual = service.sum(1, 2);
        assertEquals(3, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCutLastCharException() throws Exception {
        service.cutLastChar(null);
    }

    @Test
    public void testCutLastChar() throws Exception {
        String result = service.cutLastChar("catdog");
        assertEquals("catdo", result);
    }
}