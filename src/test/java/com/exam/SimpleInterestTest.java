package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestTest {

    @Test
    void testInterest() {
        SimpleInterest si = new SimpleInterest();
        assertEquals(200.0, si.calculate(1000, 10, 2), 0.001);
    }

    @Test
    void testZeroTime() {
        assertEquals(0.0, new SimpleInterest().calculate(1000, 10, 0), 0.001);
    }
}