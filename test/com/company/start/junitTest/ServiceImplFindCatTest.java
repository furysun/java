package com.company.start.junitTest;

import com.company.start.junitTest.first.Cat;
import com.company.start.junitTest.first.Service;
import com.company.start.junitTest.first.ServiceImpl;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class ServiceImplFindCatTest {
    private Service service = new ServiceImpl();

    @Ignore
    @Test
    public void testFindCatById() throws Exception {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "tom"));
        cats.add(new Cat(2, "rom"));
        cats.add(new Cat(3, "tim"));

        Cat result = service.findCatById(cats, 1);

        assertEquals(cats.get(0), result);
        assertEquals("tom", result.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCatByIdNull() throws Exception {
        service.findCatById(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCatByIdEmpty() throws Exception {
        service.findCatById(new ArrayList<>(), 1);
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindCatByIdNotFound() throws Exception {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "tom"));

        service.findCatById(cats, 3);
    }

    @Test
    public void testFindCatByIdNotFoundMessage() throws Exception {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "tom"));

        try {
            service.findCatById(cats, 3);
        } catch (NoSuchElementException e) {
            assertEquals("cat not found", e.getMessage());
        }
    }
}
