package com.example.graphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void computeAreaTest() {
        Circle c = new Circle(0,0,1);
        double r = 1;
        double result = Math.PI*r*r;
        assertEquals (c.computeArea(), result, 0.01);
    }

    @Test
    void computeCircumferenceTest() {
        Circle c = new Circle(0,0,1);
        double r = 1;
        double result = 2*Math.PI*r;
        assertEquals (c.computeCircumference(), result, 0.01);
    }

}