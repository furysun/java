package com.company.start.junitTest.first;

import java.util.List;
import java.util.NoSuchElementException;

public class ServiceImpl implements Service {
    @Override
    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    @Override
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    @Override
    public String cutLastChar(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        return s.substring(0, s.length() - 1);
    }

    @Override
    public Cat findCatById(List<Cat> cats, int id) {
        if (cats == null || cats.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (Cat cat : cats) {
            if (cat.getId() == id) {
                return cat;
            }
        }

        throw new NoSuchElementException("cat not found");
    }
}
