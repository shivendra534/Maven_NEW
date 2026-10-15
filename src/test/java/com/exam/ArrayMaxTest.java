package com.exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxTest {

    ArrayMax am = new ArrayMax();

    // ================= POSITIVE TEST CASES =================

    @Test @DisplayName("Positive: normal array")
    void positive_normalArray() {
        assertEquals(8, am.findMax(new int[]{3, 9, 2, 7}));
    }

    @Test @DisplayName("Positive: max at start")
    void positive_maxAtStart() {
        assertEquals(50, am.findMax(new int[]{50, 10, 20}));
    }

    @Test @DisplayName("Positive: max at end")
    void positive_maxAtEnd() {
        assertEquals(80, am.findMax(new int[]{10, 20, 80}));
    }

    @Test @DisplayName("Positive: single element")
    void positive_singleElement() {
        assertEquals(5, am.findMax(new int[]{5}));
    }

    @Test @DisplayName("Positive: all negative numbers")
    void positive_allNegativeNumbers() {
        assertEquals(-2, am.findMax(new int[]{-8, -2, -15}));
    }

    @Test @DisplayName("Positive: duplicate maximum")
    void positive_duplicateMaximum() {
        assertEquals(7, am.findMax(new int[]{7, 3, 7, 1}));
    }

    // ================= NEGATIVE TEST CASES =================

    @Test @DisplayName("Negative: empty array throws exception")
    void negative_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> am.findMax(new int[]{}));
    }

    @Test @DisplayName("Negative: null array throws exception")
    void negative_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> am.findMax(null));
    }

    @Test @DisplayName("Negative: exception message is correct")
    void negative_exceptionMessage() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> am.findMax(new int[]{}));
        assertEquals("Array must not be null or empty", e.getMessage());
    }

    @Test @DisplayName("Negative: wrong expected value is not returned")
    void negative_wrongExpectedValue() {
        assertNotEquals(100, am.findMax(new int[]{3, 9, 2, 7}));
    }
}