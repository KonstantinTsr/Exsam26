package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testSumPositive() {
        double actual = MainS.Sum(5, 2);
        double expected = 7;
        assertEquals(expected, actual, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testSumNegative() {
        double actual = MainS.Sum(-3, -1);
        double expected = -4;
        assertEquals(expected, actual, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testSumNegativeAndPositive() {
        double actual = MainS.Sum(-11, 10);
        double expected = -1;
        assertEquals(expected,actual, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testSumFloatPositive() {
        double actual = MainS.Sum(1.2, 3.4);
        double expected = 4.6;
        assertEquals(expected, actual, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testSumFloatNegative() {
        double actual = MainS.Sum(-2.3, -4.5);
        double expected = -6.8;
        assertEquals(expected, actual, 0.1);
    }
}