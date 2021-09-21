package com.example.fundamentals;

import org.junit.jupiter.api.Assertions;

class FigureTest {

    @org.junit.jupiter.api.Test
    void contains() {
        Assertions.assertTrue(
                Figure.contains(-3, 0, 5,
                        -4, 4,
                        -6, 6,
                        0, 0));
        Assertions.assertFalse(
                Figure.contains(-3, 0, 5,
                        -4, 4,
                        -6, 6,
                        123, 0));
    }

    @org.junit.jupiter.api.Test
    void testContains() {
        Assertions.assertTrue(
                Figure.contains(-6, 9, 6));
        Assertions.assertFalse(
                Figure.contains(-6, 9, 10));
    }
}