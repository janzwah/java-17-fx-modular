package com.example.graphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {
    @Test
    void computAreaTest() {
        Rectangular c = new Rectangular(0,0,1,2);
        double x = 1;
        double y = 2;
        double result = x*y;
        assertEquals (c.computeArea(), result, 0.01);
    }

    @Test
    void computeCircumferenceTest() {
        Rectangular c = new Rectangular(0,0,1,2);
        double x = 1;
        double y = 2;
        double result = 2*(x+y);
        assertEquals (c.computeCircumference(), result, 0.01);
    }

}