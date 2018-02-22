package com.company.start.junitTest.first;

import java.util.List;

public interface Service {
    boolean isEven(int value);

    int sum(int a, int b);

    String cutLastChar(String s);

    Cat findCatById(List<Cat> cats, int id);
}

