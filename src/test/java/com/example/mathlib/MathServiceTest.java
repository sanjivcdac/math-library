package com.example.mathlib;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathServiceTest {

    @Test
    public void testAdd() {
        MathService mathService = new MathService();
        assertEquals(5, mathService.add(2, 3));
    }
}