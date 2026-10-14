package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
        assertEquals(0, c.add(-2, 2));
    }
}