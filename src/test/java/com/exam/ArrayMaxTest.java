package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxTest {

    ArrayMax am = new ArrayMax();

    // Positive test cases

    @Test
    void testNormalArray() {
        assertEquals(9, am.findMax(new int[]{3, 9, 2, 7}));
    }

    @Test
    void testMaxAtStart() {
        assertEquals(50, am.findMax(new int[]{50, 10, 20}));
    }

    @Test
    void testMaxAtEnd() {
        assertEquals(80, am.findMax(new int[]{10, 20, 80}));
    }

    @Test
    void testSingleElement() {
        assertEquals(5, am.findMax(new int[]{5}));
    }

    @Test
    void testAllNegativeNumbers() {
        assertEquals(-2, am.findMax(new int[]{-8, -2, -15}));
    }

    @Test
    void testDuplicateMaximum() {
        assertEquals(7, am.findMax(new int[]{7, 3, 7, 1}));
    }

    // Negative test cases

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> am.findMax(new int[]{}));
    }

    @Test
    void testNullArray() {
        assertThrows(IllegalArgumentException.class,
                () -> am.findMax(null));
    }

    @Test
    void testExceptionMessage() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> am.findMax(new int[]{}));
        assertEquals("Array must not be null or empty", e.getMessage());
    }

    @Test
    void testWrongExpectedValue() {
        assertNotEquals(100, am.findMax(new int[]{3, 9, 2, 7}));
    }
}